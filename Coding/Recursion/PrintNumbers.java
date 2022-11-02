
import java.util.Scanner;

public class PrintNumbers {

    public static void sequence(int num)
    {
        if(num==0)
            return;
         System.out.print(num+"  ");
        sequence(num-1);
        System.out.print(num+"  ");
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            sequence(num);
        }
    }

}
