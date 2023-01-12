// package Cycle_Create;
import java.util.*;
public class Cycle_Client {
    public static void main(String[] args) throws Exception{
    Cycle_Create cc=new Cycle_Create();
    cc.addFirst(10);
    cc.addFirst(20);
    cc.addFirst(30);
    cc.addLast(50);
    cc.addFirst(60);
    cc.display();
    cc.CreateCycle();
    cc.CycleRemoval();
    cc.display();
    }
    
}