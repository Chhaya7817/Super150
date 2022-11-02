
public class TraverseDiagonal {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        diagonalTraversal(arr);
    }
    public static void diagonalTraversal(int[][] arr)
    {
        int n=arr.length;
        int m=arr[0].length;
        for(int d=0;d<n+m-1;d++)
        {
            int r,c=0;
            if(d<m)
            {
                r=0;
                c=d;
            }
            else{
                c=m-1;
                r=d-m+1;
            }
            while(r<n && c<m)
            {
                System.out.println(arr[r][c]);
                r++;
                c--;
            }
        }
    }
}
