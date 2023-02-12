package LeetCode;

public class UglyNUmberII {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
    }
    public static int nthUglyNumber(int n) {
        int [] primes =  {2,3,5};
        for (int i = 0; i <=n ; i++) {
            for (int prime:primes){
                while (i % prime==0 ){
                    i = i/prime;
                }

            }
        }
        return 0;
    }
}

