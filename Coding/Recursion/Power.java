/*Pwer of a is b */
public class Power {
    public static void main(String[] args) {
        int a=3,b=6;
        System.out.println(pwr(a,b));
        System.out.println(pwrTail(a,b,1));
    }

    //Using Head Recursion
    public static int pwr(int a,int b)
    {
        if(b==0)
            return 1;
        return a*pwr(a,b-1);
        
    }

    //Using Tail Recus=rsion
    public static int pwrTail(int a,int b,int ans)
    {
        if(b==0)
            return ans;
        return ans*a*pwrTail(a,b-1,ans);
        
    }
    
}
