import java.util.Arrays;

public class Combination2LeetCode {
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        int target=8;
        Arrays.sort(arr);
        Combination(arr, target, "", 0);
    }
    public static void Combination(int[] arr,int target,String ans,int idx) {
        if(target==0)
        {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if(i!=idx && arr[i-1]==arr[i])
            {
                continue;
            }
            if(target>=arr[i])
                Combination(arr, target-arr[i], ans+arr[i]+" ", i+1);
        }
        
    }
    
}
