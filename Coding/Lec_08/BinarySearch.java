package Lec_08;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 10, 12, 65, 78 };
        search(arr, 0);
    }

    public static int search(int arr[], int item) {
        int si = 0;
        int ei = arr.length;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == item)
                return mid;
            else if (arr[mid] > item)
                ei = mid - 1;

            else
                si = mid + 1;
        }
        return -1;
    }
}
