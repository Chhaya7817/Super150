import java.util.Scanner;

public class Board_Path {
    public static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        Paths(N, M, "");
        System.out.println("\n"+count);

    }
    public static void Paths(int N,int M,String ans) {
        if(N==0)
        {
            System.out.println(ans+" ");
            count++;
            return;
        }
        for(int i=1;i<=M;i++)
        {
            if(N>=i)
            {
                Paths(N-i, M, ans+i);
            }
        }
        
    }
}
