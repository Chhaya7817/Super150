import java.util.Scanner;

public class N_Knight_Problem {
    public static int count=0;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            boolean[][] board=new boolean[n][n];
            K_night(board, n, 0, 0, "");
        }
        System.out.println("\n"+count);

    }
    public static void K_night(boolean[][] board,int tk,int row,int col,String ans) {
        if(tk==0)
        {
            System.out.print(ans+" ");
            count++;
            return ;
        }
        if(col==board[0].length)
        {
            row++;
            col=0;
        }
        if(row==board.length)
        {
            return;
        }
        
        
        if(issafe(board,row,col))
        {
            board[row][col]=true;
            K_night(board, tk-1, row, col+1, ans+"{"+row+"-"+col+"}");
            board[row][col]=false;
        }       
        K_night(board, tk, row, col+1, ans) ;       
            
        
        
    }
    public static boolean issafe(boolean[][]board,int row,int col ) {
        int[] rows={-1,-2,-2,-1};
        int []cols={2,1,-1,-2};
        for(int i=0;i<4;i++)
        {
            int r=row+rows[i];
            int c=col+cols[i];
            if(r>=0 && r<board.length && c>=0 && c<board[0].length)
            {
                if(board[r][c]==true)
                    return false;
            }
        }
        return true;
        
    }
   
}
