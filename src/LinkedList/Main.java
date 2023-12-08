package LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ListNode n5= new ListNode(5,null);
//        ListNode n4= new ListNode(4,n5);
//        ListNode n3= new ListNode(2,null);
        ListNode n2 = new ListNode(1, null);
        ListNode n1 = new ListNode(0, n2);
        ListNode[] list1 = {n1, n2};
        System.out.println(n1);
        ListNode node = rotateRight(n1, 0);
        System.out.println(node);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (k == 0) return head;
        int n = 0;
        ListNode curr = head;
        ListNode last=new ListNode();
        while (curr != null) {
            n++;
            curr = curr.next;
            if (curr != null && curr.next == null) {
                last=curr;
            }
        }
        last.next=head;
        int r = k % n;
        if (r==0 ) {
            last.next=null;
            return head;
        }
        curr = head;
        for (int i = 0; i < n - r - 1; i++) {
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}
