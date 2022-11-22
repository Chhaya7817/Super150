import java.util.Scanner;

// you are given 2 X n field and each tile size 2 X 1 
//find number of ways possible to arrange the tiles in the field 
public class Tiling_Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the field: ");
        int n=sc.nextInt();
        System.out.println(solve(n));
    }
    public static int solve(int n) {
        if(n==0 || n==1)
        {
            return 1;
        }
                        // int vertical+=solve(n-1);
                        // int horiz+=solve(n-2);
                        // return vertical+horiz;
        return solve(n-1)+solve(n-2);
        
    }
}