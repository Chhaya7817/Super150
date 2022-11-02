public class Queen_Permutaion {
    public static void main(String[] args) {
        int n=4;
        int tq=2; //total queen
        boolean [] board=new boolean[n];
        PrintAns(board, tq, 0, "");
    }
    //qpsf queen place so far
    public static void PrintAns(boolean[] board, int tq,int qpsf,String ans)
    {
        if(qpsf==tq)
        {
            System.out.println(ans); 
            return;
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i]==false)
            {
                /*-----------------Method 1------------------ */
                board[i]=true;
                PrintAns(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf);
                board[i]=false; //undo step of backtracking


                /*-----------------Method 2------------------ */
               /*  
                board[i]=true;
                qpsf+=1;
                PrintAns(board, tq, qpsf, ans+"b"+i+"q"+qpsf);
                board[i]=false; 
                qpsf-=1;
                */
            }
        }

    }
}
