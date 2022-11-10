public class Power {

    //time Complexity log(n)
    public static void main(String[] args) {
        int a=3;
        int b=2;
        System.out.println(Pow(a, b));
    }
    public static int Pow(int a,int b) {
        if(b==0)
        {
            return 1;
        }
        int ans=Pow(a,b/2);
        ans=ans*ans;
        if(b%2==1)
        {
            ans=ans*a;
        }
        return ans;
    }
}
