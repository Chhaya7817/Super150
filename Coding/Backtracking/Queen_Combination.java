public class Queen_Combination {
    public static void main(String[] args) {
        int n=4;
        int tq=2; //total queen
        boolean [] board=new boolean[n];
        PrintAns(board, tq, 0, "",0);
    }
    //qpsf queen place so far
    public static void PrintAns(boolean[] board, int tq,int qpsf,String ans,int idx)
    {
        if(qpsf==tq)
        {
            System.out.println(ans); 
            return;
        }
        for(int i=idx;i<board.length;i++)
        {
            if(board[i]==false)
            {
                board[i]=true;
                PrintAns(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf,i+1);
                board[i]=false; //undo step of backtracking


                
            }
        }
    }
        
}
