import java.util.*;
public class Next_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			
			next_Permutation(arr,n);
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
			System.out.println();

		}
    }
    public static void next_Permutation(int [] arr,int n) {
        int x=0;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                x=i;
                break;
            }
        }
        int y=0;
        for(int i=arr.length-1;i>x;i--)
        {
            if(arr[i]>arr[x])
            {
                y=i;
                break;
            }
        }

        if(y==0 && x==0)
        {
            reverse_range(arr,0,arr.length-1);
            return;
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
        // reverse_range(arr,x+1,arr.length-1);
    }
    public static void reverse_range(int[] arr,int i,int j)
	{
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
