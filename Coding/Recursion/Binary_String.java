//Print all binary strings of size without cosecutive 1's

public class Binary_String {
    public static void main(String[] args) {
        print(3, '0', "");
    }

    public static void print(int n,char lp,String ans) {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
  
        print(n-1, '0', ans+'0');
        
        if(lp=='0')
        {
            print(n-1, '1', ans+'1');        }
    }
}
