import java.net.SocketTimeoutException;

public class Binary_Tree_Client {
    public static void main(String[] args) {
        Binary_Tree bt=new Binary_Tree();
        // bt.InOrder();
        System.out.println(bt.Search(12));
        System.out.println(bt.Max());
        System.out.println(bt.height());
    }
    

}
