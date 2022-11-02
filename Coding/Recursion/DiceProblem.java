public class DiceProblem {
    public static void main(String[] args) {
        int n=4;
        PrintPath(0, n, "");
    }

    public static void PrintPath(int curr, int end ,String ans)
    {
        if(curr==end)
        {
            System.out.println(ans);
            return;
        }
        if(curr>end)
        {
            return;
        }
        PrintPath(curr+1, end, ans+1);
        PrintPath(curr+2, end, ans+2);
        PrintPath(curr+3, end, ans+3);
    }
    
}
