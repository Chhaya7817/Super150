import java.util.Scanner;

public class CompareStr {
    public static int isCompare(String s1,String s2)
    {
        int i=0,j=0;
        while(i<s1.length() && j<s2.length())
        {
            if(s1.charAt(i)>s2.charAt(i))
                {
                    return s1.charAt(i)-s2.charAt(j);
                }
            i++;
            j++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="rtik";
        String s2="zatik";
       

        
        
    }
}


  /* int i=0;
        while(i>s1.length())
        {
            if(s1.charAt(i)>s2.charAt(i))
                {System.out.println(s1);
                    return;}
            if(s1.charAt(i)<s2.charAt(i))
                {System.out.println(s2);
                    return;}
        
                    i++;
        }
        i++;
        if(i<s1.length())
            {System.out.println(s1);
            return;}
        if(i<s2.length())
           { System.out.println(s2);
        return;}
            System.out.println("Equal");*/




