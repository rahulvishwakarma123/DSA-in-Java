public class CountElem {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 7},
            {7, 8, 9}
        };
        int key = 7;

        System.out.println(key + " occurs " + countElem(array, key) + " times.");
        ;
    }

    public static int countElem(int[][] array, int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }
}