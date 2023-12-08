package LinkedList;

public class ListNode {
    int val;
    ListNode next;

    @Override
    public String toString() {
        String s = val + ", " + next;
        return s;
    }

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
