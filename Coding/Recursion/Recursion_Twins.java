import java.util.Scanner;

public class Recursion_Twins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String child=sc.next();
        Twins(child, 0);
    }
    public static void Twins(String child,int count) {
        if(child.length()==2)
        {
            System.out.println(count);
            return;
        }
        if(child.charAt(0)==child.charAt(2))
            Twins(child.substring(1), count+1);
        else
            Twins(child.substring(1), count);

        
    }
}
