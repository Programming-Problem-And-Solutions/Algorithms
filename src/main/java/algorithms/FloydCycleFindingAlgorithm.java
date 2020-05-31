package main.java.algorithms;

import common.ListNode;
import main.java.common.LinkedLIst;

/*
This is noting but having two two pointers, slow and fast.
if both pointers collides i.e list has cycle;

 */
public class FloydCycleFindingAlgorithm {

    public static void main(String[] args) {
        LinkedLIst list = new LinkedLIst();

        // creating first linked list
        list.head = new ListNode<>(3);
        list.head.next = new ListNode<>(6);
        list.head.next.next = new ListNode<>(9);
        list.head.next.next.next = new ListNode<>(15);
        list.head.next.next.next.next = new ListNode<>(30);
        list.head.next.next.next.next.next = list.head.next;

        System.out.println(findNodeWithCycle(list));
    }

    private static Integer findNodeWithCycle(LinkedLIst list) {
        ListNode<Integer> node1  = list.head;
        ListNode<Integer> node2 = list.head;

        while (node2 != null) {
            node1 = node1.next;
            node2 = node2.next.next;

            if (node1.data == node2.data) {
                return node1.data;
            }
        }
        return -1;
    }
}
