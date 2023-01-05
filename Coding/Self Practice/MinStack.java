import java.util.*;
public class MinStack {
    public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] operation=new String[n];

		for(int i=0;i<n;i++)
		{
			operation[i]=sc.next();

		}
		Stack<Integer> minSt=new Stack<>();
		for(int i=0;i<n;i++)
		{
			if(operation[i].trim()=="push")
			{
				int p=sc.nextInt();
				minSt.push(p);
				System.out.print("gv");
			}
			else if(operation[i]=="pop")
			{
				if(!minSt.isEmpty())
					minSt.pop();
			}
			else if(operation[i]=="top")
				System.out.print(minSt.peek()+" ");
			else if(operation[i]=="getMin")
				System.out.print(minSt.getMin()+" ");
	
		}
    }
}
