public class BinarySearch{
    public static void main(String[] args) {
        int [] arr={45,23,9,54};
        int val=23;
        binaryS(arr, val);
        // System.out.println("Searched element found at"+f);

    }
    public static void binaryS(int[] arr,int val)
    {
        int n=arr.length;
        int low=0;
        int idx=-1;
        int high=n;
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(arr[mid]==val)
                {
                    System.out.println(mid);
                    break;
                }
            else if(arr[mid]<val)
            {
                low=mid+1;
            }
            else
                high=mid-1;
        }
    }
}