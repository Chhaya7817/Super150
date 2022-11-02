public class ReversealAlgo {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        
        Range_reverse(arr,n-k-1,n);

        Range_reverse(arr,0,n-k);
        
    }
    public static void Range_reverse(int arr[],int i,int j)
    {

    }
}
