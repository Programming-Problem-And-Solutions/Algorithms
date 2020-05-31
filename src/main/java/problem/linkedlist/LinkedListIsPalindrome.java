package main.java.problem.linkedlist;

import common.ListNode;
import main.java.common.LinkedLIst;

public class LinkedListIsPalindrome {

    private static ListNode head = LinkedLIst.getLinkedList();
    private static boolean isPalindrome = true;

    private static void stack(ListNode node) {
        if (node == null)  return;

        stack(node.next);
        if (node.data != head.data) {
            isPalindrome = false;
        }
        head = head.next;
    }

    public static void main(String[] args) {
        stack(LinkedLIst.getLinkedList());
        System.out.println(isPalindrome);
    }
}
