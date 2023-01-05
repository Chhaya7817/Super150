import java.util.*;

public class FirstNegative {
    public static void main(String[] args) {
        int[] arr={1,5,-6,6,9,4,5};
        int[] ans=firstNeg(arr, 3);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
    public static int[] firstNeg(int[] arr, int k)
    {
        Deque<Integer> que=new LinkedList<Integer>();
        int[] ans= new int[arr.length -k +1];
        int j=0;
        for(int i=0;i<k;i++)
        {
            if(arr[i]<0)
                que.addFirst(i);
        }
        if(!que.isEmpty())
            ans[j++]=arr[que.getFirst()];
        else
            ans[j++]=0;
        
        for(int i=k;i<arr.length;i++)
        {
            while(!que.isEmpty() && que.getFirst()<=i-k)
            {
                que.removeFirst();
            }
            if(arr[i]<0)
                que.addFirst(i);

            if(!que.isEmpty())
                ans[j++]=arr[que.getFirst()];
            else
                ans[j++]=0;
        }
        return ans;

    }
}
