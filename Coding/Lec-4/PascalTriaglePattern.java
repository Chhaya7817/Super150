import java.util.*;
public class PascalTriaglePattern {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int row=0;
    int star=1;
    while(row<n)
    {
        int j=0;
        int val=1;
        while(j<star)
        {
            System.out.print(val+" ");   
            val=(val * (row-j))/ (j+1);
            j++;
        }
        row++;
        star++;
        System.out.println();
    }
}
}
