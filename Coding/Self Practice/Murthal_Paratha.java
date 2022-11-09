import java.util.*;
public class Murthal_Paratha {
    /**
     * @param args
     */
    public static void main(String args[]) {

        final Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int L = sc.nextInt();
        int []R = new int[L];
        for (int i = 0; i < L; i++) {
            R[i] = sc.nextInt();
        }
        System.out.println(totalMinutes(P, L, R));

    }

    public static int totalMinutes(int P, int L, int[] R) {
        int currP = 0;
        int[] arr = new int[L];
        int[] count = new int[L];
        Arrays.fill(count, 1);
        for (int i = 0; i < L; i++) {
            arr[i] = R[i];

        }
        int time = 0;
        while (currP != P) {
            
            for (int i = 0; i < L; i++) {
                if (currP == P) {
                    break;
                }
                if (arr[i] == time) {
                    currP++;
                    count[i]++;
                    arr[i] += R[i] * count[i];
                }
            }
            time++;
        }
        return time-1;

    }
}
