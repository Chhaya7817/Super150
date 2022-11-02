import java.util.Scanner;

public class CountSubSeq {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.next();
        String ans="";
        // printpermutatiom(str, ans);
        // System.out.println("Number of subSequences "+count);

        System.out.println(countpermutatiom(str, ans));
    }

    public static void printpermutatiom(String ques,String ans) {
        if(ques.length()==0)
        {
            System.out.println(ans);
            count++;
            return;
        }
        char ch=ques.charAt(0);
        printpermutatiom(ques.substring(1), ans);
        printpermutatiom(ques.substring(1), ans+ch);


    }
    public static int countpermutatiom(String ques,String ans) {
        if(ques.length()==0)
        {
          //  System.out.println(ans);
            count++;
            return 1;
        }
        char ch=ques.charAt(0);
        int ans1=countpermutatiom(ques.substring(1), ans);
        int ans2=countpermutatiom(ques.substring(1), ans+ch);
        return ans1+ans2;


    }
}
