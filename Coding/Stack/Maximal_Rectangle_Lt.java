public class Maximal_Rectangle_Lt {
    public static void main(String[] args) {
        int[][] matrix=new int[5][7];
        int area=0;
        int[] ans=new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==1)
                {
                    ans[j]++;
                }
                else{
                        ans[j]=0;
                }
            }
        }
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
}
