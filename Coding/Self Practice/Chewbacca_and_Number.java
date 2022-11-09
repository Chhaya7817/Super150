public class Chewbacca_and_Number {
    public static void main(String[] args) {
        int num=9595;
        Chewbacca(num);
    }
    public static void Chewbacca(int n) {
        int chew=0;
        int mul=1;
        while(n>0)
        {
            int q=n%10;
            if(9-q>q)
            {
                chew=chew+q*mul;
                
            }
            else{
                chew=chew+(9-q)*mul;
            }
            
            if(n/10==0 )
            {
                if(n==9 ||n<5)
                    chew+=n*mul;
                else
                chew+=(9-n)*mul;

                break;
            }
            mul*=10;
            n/=10;

        }
        System.out.println(chew);

    }
}
