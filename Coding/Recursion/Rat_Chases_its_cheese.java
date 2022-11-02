import java.util.Scanner;

public class Rat_Chases_its_cheese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] maze=new char[n][m];
        int[][] ans=new int[n][m];
        for (int i = 0; i < maze.length; i++) {
            String str=sc.next();
            for(int j=0;j<str.length();j++)
            {
                maze[i][j]=str.charAt(j);
            }
        }
        HasPath(maze, 0, 0, ans);
    }
    public static void HasPath(char[][] maze,int cc,int cr,int[][] ans) {
        if(cr==maze.length && cc>=maze[0].length && maze[cr][cc]!='X')
        {
            System.out.println("fhdgb");
            ans[cr][cc]=1;
            Dislay(ans);
            return;
        }
        if(cr<0||cc<0||cr>=maze.length||cc>=maze[0].length||maze[cr][cc]=='X')
        {
            return;
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        HasPath(maze, cc, cr-1,ans);//up
        HasPath(maze, cc, cr+1,ans);//down
        HasPath(maze, cc-1, cr,ans);//left
        HasPath(maze, cc+1, cr,ans);//right
        maze[cr][cc]='O';
        ans[cr][cc]=0;
       
    }
    public static void Dislay(int[][] ans) {
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
}
