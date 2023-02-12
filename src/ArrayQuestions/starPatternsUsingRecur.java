package ArrayQuestions;

public class starPatternsUsingRecur{
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        starPatterns(4,0);
//        starPatterns2(4, 0);
    }
    static void starPatterns(int r,int c){
        if(r==0){
          return;
        }
        if(c<r){
          System.out.print("*");
          starPatterns(r,c+1);

        }
        else{
            System.out.println("");
            starPatterns(r-1,0);
        }
    }
    static void starPatterns2(int r,int c)
    {
      if(r==0){
        return;
      }
      if(c<r)
      {
        starPatterns2(r,c+1);
        System.out.print("*");
      }
      else{
        starPatterns2(r-1,0);
        System.out.println("");
      
      }
    }
}