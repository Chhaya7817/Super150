import java.util.Scanner;
public class Kartik_Bhaiya_And_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int k=sc.nextInt(); 
		String str=sc.next();
        int pa=checkPerfect(k, str, 'a');
        int pb=checkPerfect(k, str, 'b');
        System.out.println(Math.max(pa, pb));
    }
    public static int checkPerfect(int k,String str,int ch) {
        int si=0,ei=0;
        int flips=0,ans=0;
        while(ei<str.length())
        {
            if(str.charAt(ei)==ch)
            {
            
                flips++;
            }
            while(flips>k)
            {
                if(str.charAt(si)==ch)
                {
                    flips--;
                }
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
        
    }
}
