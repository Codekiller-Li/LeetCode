import java.awt.*;

public class Test_21 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null==l1) {
            return l2;
        }
        if (null==l2) {
            return l1;
        }
        ListNode virtulHead = new ListNode(0);
        ListNode current = virtulHead;
        ListNode p = l1;
        ListNode q = l2;
        while(p!=null && q!=null){
            if (p.val<q.val) {
                current.next = p;
                p = p.next;
                current = current.next;
            } else {
                current.next = q;
                q = q.next;
                current = current.next;
            }
        }
        if (p!=null) {
            current.next = p;
        }
        if (q!=null) {
            current.next = q;
        }
        return virtulHead.next;
    }
    public static void main(String[] args){
        Test_21 test_21 = new Test_21();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(8);
        l1.next=l2;
        ListNode l3 = new ListNode(9);
        l2.next=l3;

        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l4.next=l5;
        ListNode l6 = new ListNode(7);
        l5.next=l6;
        ListNode l7 = new ListNode(6);
        l6.next=l7;

        ListNode l =test_21.mergeTwoLists(l1,l4);
        while (l!=null){
            System.out.println(l.val);
            l=l.next;
        }
    }
}
