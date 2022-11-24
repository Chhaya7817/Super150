import java.util.Stack;

public class Stock_Span {
 
    public static void main(String[] args) {
        int[] arr={10,1,2,3,5,4,8,7};
        ColSpan(arr);
    }

    public static void ColSpan(int[] arr) 
    {
        int [] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < arr.length; i++)
         {
            while(!st.isEmpty() && arr[i]>=arr[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i]=i-st.peek();
            }
            else{
                ans[i]=i+1;
            }
            st.push(i);
        }
        

        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i]+" "+ans[i]);
            
        }
}
}
