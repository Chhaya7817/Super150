package Lec_08;

public class Square_root {
    public static void main(String[] args) {
        int n = 47;
        root(n);
    }

    public static int root(int n) {
        int low = 1;
        int high = n;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;

    }
}
