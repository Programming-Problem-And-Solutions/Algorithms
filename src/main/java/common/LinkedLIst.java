package common;

public class LinkedLIst {
    public static ListNode<Integer> head;
//who is this?aky\? ohh

    public static ListNode getLinkedList() {
        head = new ListNode<>(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        return head;
    }
}
