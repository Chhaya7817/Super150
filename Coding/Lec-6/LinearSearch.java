
public class LinearSearch {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int arr[]={2,3,-1,4,7,11,9};
        int min=arr[0],ind=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
              {  
                ind=i;
            }
        }
            System.out.print(min+  "    "+ind);
        

    }
}
