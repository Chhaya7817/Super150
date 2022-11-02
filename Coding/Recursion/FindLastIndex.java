public class FindLastIndex {
    public static void main(String[] args) {
        int[] arr={2,33,52,31,69,31,31};
        int ele=3;
        System.out.println(findIndex(arr,arr.length-1,ele));
    }
    public static int findIndex(int[] arr,int l,int ele)
    {
        if(l<0)
            return -1;
        if(arr[l]==ele )
            return l;
        return findIndex(arr, l-1, ele);
    }
}
