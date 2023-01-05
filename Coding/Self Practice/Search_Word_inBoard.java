import java.util.*;
public class Search_Word_inBoard {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();

        int k=sc.nextInt();
        char[][] board=new char[M][N];
        for(int i=0;i<M;i++)
        {
            String w=sc.next();
            for(int j=0;j<N;j++)
            {
                board[i][j]=w.charAt(j);
            }
        }
        String[] Swords=new String[k];
        for(int i=0;i<k;i++)
        {
            Swords[i]=sc.next();
        }
        // for(int i=0;i<k;i++)
        // {
        //     System.out.print(Search(Swords[i],0,0,board),Swords[i]);
        //     if(Search(Swords[i],0,0,board))
        //     {
        //         System.out.print(Swords[i]+" ");
        //     }
        // }

        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    public static boolean Search(String word,int posX,int posY,char board[][])
    {
        if(word.length()==0)
        {
            return true;
        }
        if(posX<0 || posX>=board.length||posY<0 || posY>=board[0].length ||board[posX][posY]=='.'||board[posX][posY]!=word.charAt(0))
        {
            return false;
        }
        // if(word.charAt(0)!=board[posX][posY])
        // {
        //     char ch=board[posX][posY];
        //     board[posX][posY]='.';
        //     Search(word.substring(1),posX+1,posY,board);
        //     Search(word.substring(1),posX,posY+1,board);
        //     board[posX][posY]=ch;
        // }
        char ch=board[posX][posY];
        board[posX][posY]='.';
        Search(word.substring(1),posX+1,posY,board);
        Search(word.substring(1),posX-1,posY,board);
        Search(word.substring(1),posX,posY+1,board);
        Search(word.substring(1),posX,posY-1,board);
        board[posX][posY]=ch;
        return false;
    }
}
