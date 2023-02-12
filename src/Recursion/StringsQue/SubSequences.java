package Recursion.StringsQue;

import javax.imageio.ImageIO;

public class SubSequences {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        subsequencesString("","abc");
    }
    static void subsequencesString(String process,String unProcess){
        if(unProcess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch = unProcess.charAt(0);
        subsequencesString(process,unProcess.substring(1));
        subsequencesString(process+ch, unProcess.substring(1));
    }
}
