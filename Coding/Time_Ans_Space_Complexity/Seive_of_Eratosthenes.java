public class Seive_of_Eratosthenes {
    public static void main(String[] args) {
        int n=100;
        PrimeSeive(n);
    }
    public static void PrimeSeive(int n) {
        boolean[] arr=new boolean[n+1];
        
        arr[0]=true;
        arr[1]=true;
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]==false)
            {
                for(int j=2;i*j<=n;j++)
                {
                    arr[i*j]=true;   //not prime
                }
            }
        }
    }
}
