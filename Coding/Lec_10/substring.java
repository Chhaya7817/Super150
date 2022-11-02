import java.util.Scanner;

public class substring {
    public static void print(String s)
    {
        int j=0;
        while(j<=s.length())
{
        for(int i=0;i<s.length()-j+1;i++)
        {
            String sub=s.substring(i,i+j );
            System.out.println(sub);
        }
        j++;
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        print(s);
    }
}
