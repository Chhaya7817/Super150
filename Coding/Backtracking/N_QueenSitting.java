import java.util.Scanner;

public class N_QueenSitting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
		boolean[][] board = new boolean[n][n];
		N_Queen(board, n, 0);
    }
    public static void N_Queen(boolean[][]board,int tq,int row) {
        if(tq==0)
        {
            Dislay(board);
            return;
        }
        for(int col=0;col<board.length;col++)
        {
            if(issafe(board, row, col))
            {
                board[row][col]=true;
                N_Queen(board, tq-1, row+1);
                board[row][col]=false;
            }
        }
        

        
    }

    public static boolean issafe(boolean[][] board,int row,int col) {
        //check vertically
        int r=row;
        while(r>=0)
        {
            if(board[r][col]==true)
                return false;
            r--;
        }

        //check right diagonally
        int c=col;
        r=row;
        while(r>=0 && c<=board.length-1)
        {
            if(board[r][c]==true)
                return false;

                r--;
                c++;
            
        }
        //check left diagonally
        r=row;
        c=col;
        while(c>=0 && r>=0)
        {
            if(board[r][c]==true)
            {
                return false;
            }
            r--;
            c--;
        }
        return true;

        
    }
    public static void Dislay(boolean[][]board) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
