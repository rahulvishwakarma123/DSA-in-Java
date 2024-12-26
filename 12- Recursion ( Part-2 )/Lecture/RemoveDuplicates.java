public class RemoveDuplicates {

    public static void removeDuplicates(String s,int index,StringBuilder newStr, boolean map[]){
        if(index == s.length()) {
            System.out.println(newStr);
            return;            
        }

        char currchar = s.charAt(index);


        // kaam
        if (map[currchar - 'a'] == true){
            //duplicates
            index++;
            removeDuplicates(s, index, newStr, map);            
        }else{
            map[currchar-'a'] = true;
            removeDuplicates(s, index++, newStr.append(currchar), map);
        }

    }
    public static void main(String[] args) {
        String s = new String("apnacollage");
        removeDuplicates(s, 0, new StringBuilder(""), new boolean[26]);

    }
}
