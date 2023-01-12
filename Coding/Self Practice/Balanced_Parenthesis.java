import java.util.Scanner;
import java.util.Stack;

public class Balanced_Parenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(st);
            char ch =str.charAt(i);
            if(ch=='{' || ch=='('||ch=='[')
                st.push(ch);
            else{
                // if(st.isEmpty())
                
                if(ch=='}' && st.peek()=='{' || ch==')' && st.peek()=='(' || ch==']' && st.peek()=='[')
                st.pop();
            
            }
        }
        if(st.isEmpty())
            System.out.println("valid");
        else
        System.out.println("No valid");
    }
}
