public class PascalTriangle {
    public static void main(String[] args) {
        int rows=10;
        Pascal(rows);
    }
    public static void Pascal(int n) {
        int star=1;
        for(int i=0;i<n;i++)
        {
            int col=0;

            int val=1;
            while(col<star)
            {
                System.out.print(val+" ");
                val=val*(i-col)/(col+1);
                col++;
            }
            star++;
            System.out.println();

        }
    }
}
