class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}
public class MiddleOfLinkedList{
    Node head;
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
        head=newNode;
        return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void findMiddle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Middle: "  + slow.data);
    }
    public static void main(String[]args){
        MiddleOfLinkedList list = new MiddleOfLinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.findMiddle();
    }
}