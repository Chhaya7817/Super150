public class Letter_Tile_Possiblities {
    public static void main(String[] args) {
        String str="AAB";
        int fre[]=new int[26]; //frequency of string
        for(int i=0;i<str.length();i++)
        {
            fre[str.charAt(i)-'A']++;
        }
        Tile_Possibilities(fre, "");
        System.out.println(k-1);
    }
    public static int k=0;
    public static void Tile_Possibilities(int [] fre,String ans) {
        System.out.println(ans);
        k++;
        for(int i=0;i<fre.length;i++)
        {
            if(fre[i]>=1)
            {
                char ch=(char)(i+'A');
                fre[i]--;
                Tile_Possibilities(fre,ans+ch);
                fre[i]++;
            }
        }
        
        
    }
}
