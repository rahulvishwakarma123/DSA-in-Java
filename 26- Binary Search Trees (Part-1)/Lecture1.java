

public class Lecture1 {
        static class Node {
            int val;
            Node left;
            Node right;
            Node(int v){
                this.val = v;
            }
        }

        // for inserting the Node into the bst;
        public static Node insert(Node root, int val){
            if(root == null){
                Node newNode = new Node(val);
                root = newNode;
                return root;
            }
            if(root.val > val){
                root.left = insert(root.left, val);
            }else
                root.right = insert(root.right, val);
            return root;
        }

        // print the inOrder sequence 
        public static void inOrder(Node root){
            if(root == null) return;
            inOrder(root.left);
            System.out.print(root.val);
            inOrder(root.right);
        }

        // for searching the Node from the bst;
        public static Node search(Node root, int val){
            if(root == null){
                return null;
            }
            if(root.val > val) return search(root.left, val);
            else if(root.val < val) return search(root.right, val);
            else return root;
        }

        // function for deleting a Node from the Tree;
        public static Node delete(Node root, int data){
            if(root == null) return null;
            // sabse pahale ham data ko search karenge jisse delete karna hai
            if (root.val > data) root.left = delete(root.left, data);
            else if(root.val < data) root.right = delete(root.right, data);

            // yaha hame data mil raha hai jo delete hone wala hai;
            else { 

                //case 1: agar koi child node nahi hai
                if(root.left == null && root.right == null){
                    return null;
                }

                //case 2: agar koi ek child node hai
                if(root.left == null) return root.right;
                else if(root.right == null) return root.left;

                //case 3: agar dono child hai

                // first find the inOrder Successor
                Node IS = findIS(root.right);  // we replace the root with inOrder successor because it comes next after right most Node in left subtree means it follows the sequence of inOrder successor.
                root.val = IS.val;
                root.right = delete(root.right, IS.val);

            }
            return root;
        }
        public static Node findIS(Node root){
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }

    public static void main(String[] args) {
        int[] values = {2,3,5,2,5,2,7};
        Node root = null;
        for (int val : values) {
            root = insert(root, val);
        }
        Node val = search(root, 5);
        System.out.println(val.val);
        delete(root, 3);
        inOrder(root);


    }
}
