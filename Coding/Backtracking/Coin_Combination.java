public class Coin_Combination {
    public static void main(String[] args) {
        int coin[]={2,3,5,7};
        int amount=10;
        PrintAns(coin, amount, "",0);
    }
    public static void PrintAns( int [] coin,int amount,String ans,int ind) {
        if(amount==0)
        {
            System.out.println(ans);
            return;
        }
        
        for(int i=ind;i<coin.length;i++)
        {
            if(amount>=coin[i] )
                PrintAns(coin, amount-coin[i], ans+coin[i],ind+1);
           

        }
        
    }
}
