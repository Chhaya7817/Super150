public class TowerHanoi {
    public static void main(String[] args) {
        int n=3;
        String src="A";
        String hlp="B";
        String des="C";
        TOH(n, src, hlp, des);
    }
    public static void TOH(int n,String src,String hlp,String des)
    {
        if(n==0)
        return;
        TOH(n-1,src,des,hlp);
        System.out.println("Move"+n+" th disc "+src+" to "+des);
        TOH(n-1, hlp, src, des);

    }
    
}
