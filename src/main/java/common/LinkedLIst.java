package main.java.common;

import common.ListNode;

public class LinkedLIst {
    public static ListNode<Integer> head;

    public static ListNode<Integer> head2; // introduced to illustrate merged linked lists


    public static ListNode getLinkedList() {
        head = new ListNode<>(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        return head;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
