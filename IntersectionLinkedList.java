class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class IntersectionLinkedList {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a; 
    }
    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = common;
        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = common;
        ListNode result = getIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println("Intersection at: " + result.val);
        } else {
            System.out.println("No intersection");
        }
    }
}