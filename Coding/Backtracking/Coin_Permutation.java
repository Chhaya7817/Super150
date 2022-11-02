public class Coin_Permutation {
    public static void main(String[] args) {
        int coin[]={2,3,5,7};
        int amount=10;
        PrintAns(coin, amount, "");
    }
    public static void PrintAns( int [] coin,int amount,String ans) {
        if(amount==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<coin.length;i++)
        {
            /*---------Implicit Backtracking------- */
            // if(amount>=coin[i])
            // PrintAns(coin, amount-coin[i], ans+coin[i]);
            /*----------Back Tracking--------- */
            if(amount>=coin[i])
            {
                amount-=coin[i];
                PrintAns(coin, amount, ans+coin[i]);
                amount+=coin[i];
            }

        }
        
    }
}
