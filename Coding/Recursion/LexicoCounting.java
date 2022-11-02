public class LexicoCounting {
    public static void main(String[] args) {
        int n=100;
        lexcCounting(0, n);
    }
    public static void lexcCounting(int curr,int n)
    {
        if(curr>n)
        {
            
            return;
        }
        System.out.println(curr);

        int i=0;
        if(curr==0)
        {
            i=1;
        }
        for(;i<=9;i++)
        {
             lexcCounting(curr*10+i, n);
            //  lexcCounting(curr*100+i, n);
            //  lexcCounting(curr*100+i, n);
        }
    }
}
