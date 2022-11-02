/*Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).

a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.

b. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function). */


import java.util.Scanner;

public class Maze_Path {
    public static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(); //rows V
		int n2=sc.nextInt();//Columns H
        Paths(n1, n2, "");
        System.out.println("\n"+count);
    }
    public static void Paths(int n1,int n2,String ans) {
        if(n1==1 && n2==1)
        {
            
            System.out.print(ans+" ");
            count++;
            return;
            
        }
        if(n1>1)
            Paths(n1-1, n2, ans+"V"); //Downwards move
        if(n2>1)
            Paths(n1, n2-1, ans+"H");  //Horizontal move
        if(n1>1 && n2>1)
			Paths(n1-1,n2-1,ans+"D");  //Diagonal move
    }


}
