import java.util.Scanner;

//max value of x such that x^k<=n

public class KTH_ROOT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int k=sc.nextInt();
        System.out.println(Root(n, k, 0, n));
    }
    public static long Root(long n,int k,long low,long high) {
        long res=0;
        while(low<=high)
        {
            long mid=(low+high)/2;
            if(Math.pow(mid,k)==n)
            {
                res=mid;
                break;
            }
            else if(Math.pow(mid,k)>n)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
                res=mid;
            }
        }
        return res;
    }
}
