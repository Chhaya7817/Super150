public class Partition_Equal_Subset_Sum_Leet {
    public static void main(String[] args) {
        int [] nums={2,2,1,1};
        canPartition(nums);
    }
    public static boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        if(sum/2!=0) return false;
        for(int i=0;i<nums.length;i++)
        { 
            System.out.println(sum); 
            if(subset_Sum(nums,0,sum/2,0))
            {  
                 System.out.println(sum); 
                return true;
            }
        }
        return false;
    }
    public static boolean subset_Sum(int []arr,int left_Sum,int target,int ind)
    {
        if(left_Sum==target)
        {
            System.out.println("left_sum");
            return true;
        }
        if(left_Sum>target)
            return false;
        for(int i=ind;i<arr.length;i++)
        {
            if(subset_Sum(arr,left_Sum+arr[i],target,ind+1))
                return true;
        }
        return false;
        
    
}
}
