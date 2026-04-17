class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SortLinkedList{
    public static Node merge(Node l1,Node l2){
        Node dummy = new Node(0);
        Node temp= dummy;
        while(l1!=null && l2!=null){
            if(l1.data < l2.data){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1!=null)temp.next=l2;
        else temp.next=l2;
        return dummy.next;
    }
    public static Node getMiddle(Node head){
        if(head==null) return head;
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node sortList(Node head){
        if(head==null || head.next==null)
        return head;
        Node mid=getMiddle(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node left = sortList(head);
        Node right = sortList(rightHead);
        return merge(left,right);
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[]args){
        Node head=new Node(4);
        head.next=new Node(2);
        head.next.next=new Node(1);
        head.next.next.next=new Node(3);
        System.out.print("Befor: ");
        printList(head);
        head = sortList(head);
        System.out.print("After: ");
        printList(head);
    }
}