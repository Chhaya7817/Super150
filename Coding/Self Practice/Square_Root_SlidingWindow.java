public class Square_Root_SlidingWindow {
    public static void main(String[] args) {
        int n=54;
        System.out.println(Root(n, 0, n));
    }
    public static int Root(int n,int low,int high) {
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(mid*mid==n)
                return mid;
            else if(mid*mid>n)
            { 
                 high=mid-1;
                }
            else
            {
                ans=low;
                low=mid+1;
               
            }

        }
        return ans;
    }
}
