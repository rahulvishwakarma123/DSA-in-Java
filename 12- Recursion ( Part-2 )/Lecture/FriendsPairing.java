public class FriendsPairing {
    // Que:- Given n friends, each one can remain single or paired up with some other friend.Each firend can be paired only once.find out the total number of ways in which friend can remain single or can be paird up.

    public static int rec(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        // single pair
        int single = rec(n-1);
        int pair = (n-1) * rec(n-2);
        return single + pair;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(rec(n));
        

    }
}
