//Hardware independent 
public class Time_and_space_Demo {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for(int i=0;i<10000000;i++)
        {
            // System.out.print("vdm");
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);

    }
}
