import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        String str="nitin";
        Partitioning(str,list);
        list.iterator();
    }
    public static void Partitioning(String ques,List<String> list) {
        if(ques.length()==0)
        {

            return;
        }
        for(int cut=1;cut<=ques.length();cut++)
        {
            String s=ques.substring(0, cut);
            if(isPalindrome(s))
            {
                Partitioning(ques.substring(cut),list);
                list.remove(list.size()-1);
            }


        }
        
    }
    public static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
