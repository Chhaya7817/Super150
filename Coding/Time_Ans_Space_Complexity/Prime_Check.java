public class Prime_Check {
    public static void main(String[] args) {
        int n=5;
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n) {
        int div=2;
        while(div*div<=n)
        {
            if(n%div==0)
                return false;
            div++;
        }
        return true;
        
    }
}
