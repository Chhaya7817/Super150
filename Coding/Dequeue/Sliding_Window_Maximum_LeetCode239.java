import java.util.Deque;
import java.util.LinkedList;

public class Sliding_Window_Maximum_LeetCode239 {
    public static void main(String[] args) {
        int[] arr={1,5,6,6,9,4,5};
        int[] ans=maxSlidingWindow(arr, 3);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
        
    }
    public static int[] maxSlidingWindow (int [] arr,int k) {
        Deque<Integer> dq=new LinkedList<Integer>();
        int[] ans=new int[arr.length -k+1];
        int j=1;
        for (int i = 0; i < k; i++) {
            while(!dq.isEmpty() && arr[i]>arr[dq.getLast()])
            {
                dq.removeLast();
            }
            dq.addLast(i);//add last
            
        }
        ans[0]=arr[dq.getFirst()];
        for (int i = k; i < arr.length; i++) {
            while(!dq.isEmpty() && arr[i]>arr[dq.getLast()])
            {
                dq.removeLast();
            }
            dq.addLast(i);
            if(dq.isEmpty() && dq.getFirst()<=i-k)
            {
                dq.removeFirst();
            }
            ans[j++]=arr[dq.getFirst()];
        }
        return ans;
        
    }
}
