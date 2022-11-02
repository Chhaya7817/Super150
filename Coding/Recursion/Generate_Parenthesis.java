import java.util.Scanner;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        parenthesis(n, 0, 0, "");
    }
    public static void parenthesis(int n,int open,int close,String ans) {
        if(close==n && open==n)
        {
            System.out.println(ans);
            return;
        }
        if(open<=n)
            parenthesis(n, open+1, close, ans+"(");   
        if(open>close)
            parenthesis(n, open, close+1, ans+")");     
    }
}
