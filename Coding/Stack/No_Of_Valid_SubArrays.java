import java.util.Stack;

/*
 * Given an array A of integers, return the number of non-empty continuous subarrays that satisfy the following condition:

The leftmost element of the subarray is not larger than other elements in the subarray.

 

Example 1:

Input: [1,4,2,5,3]
Output: 11
Explanation: There are 11 valid subarrays: [1],[4],[2],[5],[3],[1,4],[2,5],[1,4,2],[2,5,3],[1,4,2,5],[1,4,2,5,3].
Example 2:

Input: [3,2,1]
Output: 3
Explanation: The 3 valid subarrays are: [3],[2],[1].
 */
//without stacks bhi kar sakte hai
public class No_Of_Valid_SubArrays {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,3};
        System.out.println(validSubArray(arr));
    }

    public static int validSubArray(int[] arr)
    {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for (int j = 0; j < arr.length; j++) {
            while(!st.isEmpty() && arr[j]<st.peek())
            {
                st.pop();

            }
            st.push(arr[j]);
            ans+=st.size();
        }
        return ans;
    }
}
