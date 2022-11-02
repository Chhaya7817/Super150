import java.util.Scanner;

public class Target_Sum_Subset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		int target=sc.nextInt();
		target_sum_Subsets(arr,target,0,"");
		System.out.print("\n"+count);
    }
    public static int count=0;
    public static void target_sum_Subsets(int[] arr,int target,int ind,String ans)
	{
		if(target==0)
		{

			System.out.print(ans+"");
			count++;
			return ;
		}
		for(int i=ind;i<arr.length;i++)
		{
			if(target>=arr[i] && i>=ind)
			{
				// System.out.println(target);
				target_sum_Subsets(arr,target-arr[i],i+1,ans+arr[i]+" ");

			}
		}
        // return;
	}
}
