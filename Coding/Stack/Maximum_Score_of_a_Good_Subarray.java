public class Maximum_Score_of_a_Good_Subarray {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 4, 6, 1, 7 };
		int k=3;
		System.out.println(Area(arr,k));

	}

	public static int Area(int[] arr,int k) {

		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {

				int r = i;
				int h = arr[st.pop()];
				if (r-1>=k) {
					ans = Math.max(ans, h * r);

				} else {
					int l = st.peek();
					if(l+1<=k)
					ans = Math.max(ans, h * (r - l - 1));
				}

			}
			st.push(i);

		}

		int r = arr.length;
		while (!st.isEmpty()) {

			int h = arr[st.pop()];
			r=i;
			if (r-1>=k) {
				ans = Math.max(ans, h * r);

			} else {
				int l = st.peek();
				if(l+1>=k)
				ans = Math.max(ans, h * (r - l - 1));
			}
		}

		return ans;

	}
}
