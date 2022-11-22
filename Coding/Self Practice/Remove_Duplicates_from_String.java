import java.util.Scanner;
public class Remove_Duplicates_from_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        String str=sc.next();
        boolean[] occurance=new boolean[26];
        RemoveDuplicates(str, 0, "", occurance);
    }
    public static void RemoveDuplicates(String str,int ind,String ans,boolean[] occurance) {
        if(ind==str.length())
        {
            System.out.println(ans);
            return;
        }
        if(occurance[str.charAt(ind)-'a']==true)
        {
            RemoveDuplicates(str, ind+1, ans, occurance);   
        }
        else
        {
            occurance[str.charAt(ind)-'a']=true;
            RemoveDuplicates(str, ind+1, ans+str.charAt(ind), occurance);
        }
    }


}
