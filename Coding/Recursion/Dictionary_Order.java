import java.util.Arrays;
import java.util.Scanner;

public class Dictionary_Order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sort(str);
        lexico(str,str1, 0, "");
    }
    public static void lexico(String original,String str,int ind,String ans) {
        if(str.length()==0)
        {
            int compare=original.compareToIgnoreCase(ans);
            if(compare>0)
            System.out.println(ans);
            return;
        }
        // System.out.println("gdvf nm");
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String s1=str.substring(0, i);
            String s2=str.substring(i+1);
            
            lexico(original,s1+s2,i+1, ans+ch);
        }
        
    }
    public static String sort(String s)
    {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
