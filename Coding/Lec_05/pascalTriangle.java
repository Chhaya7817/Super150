import java.util.*;
public class pascalTriangle {
    static int fact(int num)
	{
		if(num<=0)
			return 1;
		return (num*fact(num-1));
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=10;
		int res;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				// res=fact(i)/(fact(i-j)*fact(j));
                System.out.print(fact(i)/fact(i-j)+"\t");
			}
			System.out.println();
		}
    }
    
}
