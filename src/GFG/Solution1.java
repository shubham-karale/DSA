package GFG;

class Solution1 {
  public static void main(String[] args) {
    System.out.println("Welcome to DSA");
    //printNum(10);
    printReverse(0);
  }
  static void printNum(int n){
    if (n==1){
      System.out.print(n+" ");
      return;
    }
    System.out.print(n+" ");
    printNum(n-1);

  }
  static void printReverse(int n){
    if(n==10){
      System.out.println(n);
      return;
    }
    System.out.println(n);
    printReverse(n+1);

  }

}
