import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Non_Repeating_Characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="cbabcadbdx";
        String ans="";
        Map<Character,Integer> map=new HashMap<>();
        Deque<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            
            if(!map.containsKey(ch))
            {
                map.put(ch, 1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
            q.addLast(ch);
            while(!q.isEmpty() && map.get(q.peek())>1)
            {
                // System.out.println(map.get(ch)+ " "+ch+" "+q+" "+q.peek());
                q.removeFirst();
            }
            if(q.isEmpty())
            {
                ans+="-1 ";
            }
            else
            {
                ans+=q.peek()+" ";
            }
        }
        System.out.println(ans);
        // System.out.println(map);
    }
}
