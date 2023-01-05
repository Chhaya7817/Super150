import java.lang.*;
import java.util.Stack;
//reverse stack using semi stack
public class Reverse_Stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
     
    }
    public static void reverse(Stack<Integer> st) 
    {
        if(st.isEmpty())
        {
            return;
        }
        int ii=st.pop();
        reverse(st);
        I_Down(st, ii); //setting ii elemnt in the bottom of stack
    }

    public static void I_Down(Stack<Integer> st,int item) 
    {
        if(st.isEmpty())
        {
            st.push(item);
            return;
        }
        int ii=st.pop();
        I_Down(st,item);
        st.push(ii);
    }
}
