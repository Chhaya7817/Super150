import java.util.Scanner;

//print subsequences of string
public class PrintSubSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str="Chhaya";
        String ans="";
        printpermutatiom(str, ans);

    }
    public static void printpermutatiom(String ques,String ans) {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        printpermutatiom(ques.substring(1), ans);
        printpermutatiom(ques.substring(1), ans+ch);


    }
}
