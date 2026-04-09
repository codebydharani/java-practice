class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class DetectCycle{
    Node head;
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public boolean hasCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.println("Cycle detected");
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        DetectCycle list = new DetectCycle();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.head.next.next.next.next=list.head.next;
        System.out.println(list.hasCycle());
    }
}