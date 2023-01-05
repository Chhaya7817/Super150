import java.util.Stack;

public class Largest_Rectangle_in_Histogram {


    //crus lec 43 using divide and conquore lec 14
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 4, 6, 1, 7 };
		LargestArea(arr);

	}

	public static int Area(int[] arr) {

		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {

				int r = i;
				int h = arr[st.pop()];
				if (st.isEmpty()) {
					ans = Math.max(ans, h * r);

				} else {
					int l = st.peek();
					ans = Math.max(ans, h * (r - l - 1));
				}

			}
			st.push(i);

		}

		int r = arr.length;
		while (!st.isEmpty()) {

			int h = arr[st.pop()];
			if (st.isEmpty()) {
				ans = Math.max(ans, h * r);

			} else {
				int l = st.peek();
				ans = Math.max(ans, h * (r - l - 1));
			}
		}

		return ans;

	}

	public static void LargestArea(int [] arr)
	{
		Stack<Integer> st=new Stack<>();
		int n=arr.length;
		int [] left=new int[n];//left smaller elemnts
		int [] right=new int[n];
		left[0]=-1;
		st.push(0);
		for(int i=1;i<n;i++)
		{
			while(!st.isEmpty() && arr[st.peek()]>arr[i])
				st.pop();
			if(st.isEmpty())
				left[i]=1;
			else
				left[i]=st.peek();

			st.push(i);
		}
		// st=new Stack();
		for(int i=n-1;i>=0;i--)
		{
			while(!st.isEmpty() && arr[st.peek()]>arr[i])
				st.pop();
			if(st.isEmpty())
				right[i]=n;
			else
				right[i]=st.peek();
			
			st.push(i);
		}
		int maxArea=0;
		for(int i=0;i<n;i++)
		{
			// System.out.println(right[i]);
			int area=arr[i]*(right[i]-left[i]-1);
			maxArea=Math.max(maxArea,area);
		}

		System.out.println(maxArea);



	}
}
