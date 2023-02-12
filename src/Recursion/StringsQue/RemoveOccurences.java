package Recursion.StringsQue;

public class RemoveOccurences {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        String str = "geeksforgeeks";
        String res = "";
        removeChar(str,res);
    }
    static void removeChar(String str,String res){
        if(str.isEmpty()){
            System.out.println(res);
            return;
        }
        char ch = str.charAt(0);
        if(ch=='e'){
            removeChar(str.substring(1),res);
        }
        else{
            removeChar(str.substring(1),res+ch);
        }
    }
}
