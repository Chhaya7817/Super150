import java.util.Scanner;

public class spiral_Print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][] =new int[4][5];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
                arr[i][j]=sc.nextInt();
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
