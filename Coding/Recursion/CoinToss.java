import java.util.Scanner;

public class CoinToss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of coins:");
        int n=sc.nextInt();
        toss1(n,"");
    }
    private static void toss(int n,String ans) {
        if(n==0)
        {
            System.out.println(ans);
                return;
        }
        toss(n-1,ans+"T");
        toss(n-1,ans+"H");
    }

    //Two heads should not be consecutive
    private static void toss1(int n,String ans) {
        if(n==0)
        {
            System.out.println(ans);
                return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
            toss1(n-1,ans+"H");
        toss1(n-1,ans+"T");
       
    }
}
