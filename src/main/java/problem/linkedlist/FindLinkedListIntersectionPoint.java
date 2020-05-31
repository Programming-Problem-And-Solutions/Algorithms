package main.java.problem.linkedlist;


import common.ListNode;
import main.java.common.LinkedLIst;

import java.util.HashSet;
import java.util.Set;

public class FindLinkedListIntersectionPoint {

    public static void main(String[] args) {
        LinkedLIst list = new LinkedLIst();

        // creating first linked list
        list.head = new ListNode<>(3);
        list.head.next = new ListNode<>(6);
        list.head.next.next = new ListNode<>(9);
        list.head.next.next.next = new ListNode<>(15);
        list.head.next.next.next.next = new ListNode<>(30);

        // creating second linked list
        list.head2 = new ListNode<>(10);
        list.head2.next = new ListNode<>(15);
        list.head2.next.next = new ListNode<>(30);

        System.out.println("The node of intersection is " + getNode(list));
    }

    private static Integer getNode(LinkedLIst list) {
        Set<Integer> listNodes =  new HashSet<>();
        while (list.head != null) {
            listNodes.add(list.head.data);
            list.head = list.head.next;
        }

        while (list.head2 != null) {
            if (listNodes.contains(list.head2.data)) {
                return list.head2.data;
            }
            list.head2 = list.head2.next;
        }
        return -1;
    }
}
// todo : Floyd's Cycle Detection Algorithm.