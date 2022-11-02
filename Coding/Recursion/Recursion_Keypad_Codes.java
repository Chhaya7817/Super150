import java.util.Scanner;

public class Recursion_Keypad_Codes {
    public static int count=0;
    public static void main(String[] args) {
        String[] keys={"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
        Scanner sc=new Scanner(System.in);
        int keysPressed=sc.nextInt();
        keysPressed=reverse_num(keysPressed);
        String_Formed(keysPressed, keys, "");
        System.out.println("\n"+count);
        
    }
    public static void String_Formed(int num,String[] keys,String ans) {
        if(num==0)
        {
            System.out.print(ans+" ");
            count++;
            return;
        }
        int current=num%10;
        for(int i=0;i<keys[current].length();i++)
        {
            String_Formed(num/10, keys, ans+keys[current].charAt(i));
        }
        
    }

    public static int reverse_num(int num) {
        int rev=0;
        while(num!=0)
        {
            rev=rev*10 + (num%10);
            num/=10;
        }
        return rev;
    }
}
