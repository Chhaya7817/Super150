
public class StringPermutation {
    public static void main(String[] args) {
        
        String str="abca";
        printAns(str, "");
    }
    public static void printAns(String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++)
        {
            char ch=ques.charAt(i);
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            RemoveDuplicateRes(s1+s2, ans+ch);
        }
    }
    public static void RemoveDuplicateRes(String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++)
        {
            char ch=ques.charAt(i);
            boolean f=false;
            for(int j=i+1;j<ques.length();j++)
            {
                if(ques.charAt(j)==ch)
                {
                    f=true;
                    break;
                }
            }
            if(f==false)
            {String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            RemoveDuplicateRes(s1+s2, ans+ch);}
        }
    }
    
    
}
