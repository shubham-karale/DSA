package Recursion;

public class Powerfind {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int base = 10;
        int exponent = 1024;
       // System.out.println(power(base,exponent));
       //System.out.println(powerofNum(base,exponent));
       System.out.println(powerOfNLognComplexity(base, exponent));
    }
    static int power(int base,int exponent) {
        int res = 1;
        while(exponent!=0){
            res = res*base;
            exponent--;
        }
        return res;
    }
    static int powerofNum(int base,int exponent){

        if(exponent==0){
            return 1;
        }
        return base*powerofNum(base, exponent-1);
    }
    static int powerOfNLognComplexity(int base,int exponent){

        if(exponent==0){
            return 1;
        }
        int powerby2 = powerOfNLognComplexity(base,exponent/2);
        int finalPower = powerby2*powerby2;
        if(exponent%2==1){
            finalPower = finalPower*base;
        }
        return finalPower;
    }
    
}
