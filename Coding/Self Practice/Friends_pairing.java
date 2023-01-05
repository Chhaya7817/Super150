public class Friends_pairing {
    //find number of ways to remain single or pair
    public static void main(String[] args) {
        System.out.println(pairing(3));
    }

    public static int pairing(int n) {
        
        if(n==1)    return 1;
        if(n==2)    return 2;
        // int count=0;
        // count+=pairing(n-1); //single
        // count+=(n-1)*pairing(n-2);       //pair
        // return count;
        return pairing(n-1)+ (n-1)*pairing(n-2);

    }
}
