import java.util.Scanner;

public class Chessboard_Problem {
    public static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
         moves(size, 0, 0, "{0-0}");
        System.out.println(count);
    }

    public static void moves(int size,int i,int j,String ans)
    {
        if(i==size-1 && j==size-1)
        {
            System.out.print(ans+" ");
            count++;
            return;
        }
        if(i>=size||j>=size)
            return;
        moves(size, i+2, j+1,ans+"K{"+(i+2)+"-"+(j+1)+"}");

        moves(size, i+1, j+2,ans+"K{"+(i+1)+"-"+(j+2)+"}");
        
        if(i==0||j==0||i==size-1||j==size-1)
        {
            for(int k=j+1;k<size;k++)
                moves(size, i, k,ans+"R{"+i+"-"+k+"}");
            for(int k=i+1;k<size;k++)
                moves(size, k, j,ans+"R{"+k+"-"+j+"}");
            
        }
        if(i==j||i+j==size-1)
        {
            for(int k=1;k<size-i;k++)
            {
                moves(size, i+k, j+k, ans+"B{"+(i+k)+"-"+j+"}");
            }
        }
       
                
                
            
    }

                

                // {0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-1}K{2-2} {0-0}R{0-1}R{0-2}R{1-2}R{2-2} 
                // {0-0}R{0-1}R{0-2}R{2-2} {0-0}R{0-1}R{1-1}B{2-2} {0-0}R{0-1}R{2-1}R{2-2} 
                // {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-1}B{2-2} 
                // {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2} 
                // {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{1-1}B{2-2} {0-0}B{2-2}
   /*              R{0-2}R{1-2}R{2-2}
                // R{0-2}R{2-2}
                // R{0-1}R{0-2}R{1-2}R{2-2}
                // R{0-1}R{0-2}R{2-2}
                R{0-1}R{1-1}R{1-2}R{2-2}
                R{0-1}R{1-1}R{2-1}R{2-2}
                // R{0-1}K{2-2}
                // R{0-1}R{2-1}R{2-2}
                // K{1-2}R{2-2}
                R{1-0}R{1-2}R{2-2}
                R{1-0}R{1-1}R{1-2}R{2-2}
                // R{1-0}R{1-1}R{2-1}R{2-2}
                // R{1-0}K{2-2}
                // R{1-0}R{2-0}R{2-2}
                // R{1-0}R{2-0}R{2-1}R{2-2}
                // K{2-1}R{2-2}
                // R{2-0}R{2-2}
                // R{2-0}R{2-1}R{2-2}*/

}
