import java.util.Stack;

public class Insert_Down {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int item=-3;
        System.out.println(st);
        I_Down(st,item);
        System.out.println(st);
     
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
