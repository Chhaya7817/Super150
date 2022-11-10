import java.util.*;
public class generate_Random_Numbers {
    public static void main(String[] args) {
        int low=10;
        int high=100;
        Random r=new Random();
        for (int i = 0; i < 40; i++) {
            int rn=r.nextInt(high-low+1)+low;
            System.out.println(rn+" ");
            
        }
    }
}
