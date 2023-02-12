package LeetCode;

public class DiffnInADDandMulti {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
    }
    public static int subtractProductAndSum(int n) {
     int add = 0;
     int multi = 1;
        while(n!=0){
            int rem = n%10;
            add = add+rem;
            multi = multi*rem;
            n = n/10;
    }
        return multi-add;
}
}
