
public class Cycle_Create {
    private class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int item){
        Node nn=new Node();
        nn.val=item;
        if(this.size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }

    public void addLast(int item){
        Node nn=new Node();
        nn.val=item;
        if(this.size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            tail.next=nn;
            tail=nn;
            size++;
        }
    }

    public void addAtIndex(int item,int k) throws Exception{
        if(k<0||k>size){
            throw new Exception("k out of index");
        }
        if(k==0) addFirst(item);
        else if(k==size) addLast(item);
        else{
            Node k_1th=getNode(k-1);
            Node nn=new Node();
            nn.val=item;
            nn.next=k_1th.next;
            k_1th.next=nn;
            size++;
        }
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    private Node getNode(int k) throws Exception {
        if(k<0||k>size){
            throw new Exception("k out of index");
        }
        Node temp=head;
        for(int i=1;i<=k;i++){
            temp=temp.next;
        }
        return temp;
    }

    public int getFirst(){
        return head.val;
    }
    public int getLast(){
        return tail.val;
    }

    public int getAtIndex(int k) throws Exception {
        return getNode(k).val;
    }

    public int removeFirst(){
        Node temp=head;
        return temp.val;
    }

    public int removeLast() throws Exception{
        if(size==1){
            return removeFirst();
        }
        else{
            Node ss=getNode(size-2);
        }
        Node temp=head;
        return temp.val;
    }

    public int removeAtIndex(int k) throws Exception{
        if(k==0) removeFirst();
        else if(k==size-1) removeLast();
        else {
            Node prev = getNode(k - 1);
            Node curr = prev.next;
            prev.next = curr.next;
            curr.next = null;
            size--;
            return curr.val;
        }
        return 0;//dummy
    }
    public void CreateCycle() throws Exception
    {
        tail.next=getNode(2) ;
    }
    public Node MeetingPoint(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next.next;
            if(slow==fast)
            {
                return slow;
            }
        }
        return null;
    }
    public void CycleRemoval()
    {
        Node meet=MeetingPoint(head);
        if(meet==null)
            return;
        Node temp=meet;
        int count=1;
        while(temp.next!=meet){
            count++;
            temp=temp.next;
        }
        Node fast=head;
        for(int i=1;i<=count;i++)
        {
            fast=fast.next;
        }
        Node slow=head;
        while(slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
    public void CycleRemoval2()
    {
        Node meet=MeetingPoint(head);
        if(meet==null)
            return;
        Node fast=meet;
        Node slow=head;
        while(slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
    
}
