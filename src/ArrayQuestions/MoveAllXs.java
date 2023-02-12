package ArrayQuestions;

public class MoveAllXs {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        String newStr = "";
        String str = "axbcxxd";
        char target = 'x';
        moveX(str,0,'x',"",0);


    }
    static void moveX(String str,int index,char target,String newStr,int count){
        if (index==str.length()){
            for (int i = 0; i <count ; i++) {
                newStr = newStr+'x';
            }
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(index);
        if(ch=='x'){
            count++;
            moveX(str,index+1,target,newStr,count);
        }
        else{
            newStr = newStr+ch;
            moveX(str,index+1,target,newStr,count);

        }
    }
}
