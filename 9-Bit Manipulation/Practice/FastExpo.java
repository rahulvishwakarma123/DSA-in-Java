public class FastExpo {

    public static int fastExponential(int a, int n){
        int ans = 1;
        while(n>=1){
            if(n%2 == 1){
                ans = ans*a;
            }
            n = n/2;
            a = a*a;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 6;
        int a = 2;
        int answer = fastExponential(a, n);
        System.out.println(answer);
        
    }
}