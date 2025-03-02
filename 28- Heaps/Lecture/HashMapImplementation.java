import java.util.*;

public class HashMapImplementation {
    static class HashMap<K, V> { // generic - General for all 
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        
        private int n; // n - number of nodes.
        private int N;
        private LinkedList<Node> buckets[]; // N - number of buckets

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];  // Define the size of the bucket.
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hash = key.hashCode(); // -> It gives positive or negative value
            return Math.abs(hash) % N;
        }

        private int SearchInLL(K key, int bucketIndex){
            LinkedList<Node> ll = buckets[bucketIndex];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];
            N = N*2;
            // Initialization
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add to new bucket.
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){ // O(lambda) -> O(1)
            int bucketIndex = hashFunction(key);
            int dataIndex = SearchInLL(key, bucketIndex);

            if (dataIndex != -1) {
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value = value;
            }
            else{
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            }

            // checking the need of rehashing.

            double lambda = (double)n/N;
            if (lambda > 2) { // 2 is the threshold value.
                rehash();
            }

        }
    
        public boolean containsKey(K key){ // O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            return (di != -1) ? true : false;
        }
    
        public V remove(K key){ // O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }
        
        public V get(K key){ // O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }

        public ArrayList<K> keySet(){ //O(n)
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){ //O(1)
            return n == 0;
        }
    
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Nepal", 5);
        hm.put("US", 50);
        hm.put("China", 150);

        ArrayList<String> Keys = hm.keySet();
        for (String string : Keys) {
            System.out.println(string);
        }
        System.out.println();
        

        System.out.println(hm.isEmpty());
        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.get("India"));
        
    }
}