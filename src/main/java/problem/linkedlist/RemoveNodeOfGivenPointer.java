package main.java.problem.linkedlist;

import common.ListNode;
import main.java.common.LinkedLIst;

public class RemoveNodeOfGivenPointer {
    public static void main(String[] args) {
        ListNode linkedList = LinkedLIst.getLinkedList();
        removeNodeOfGivenPointer(linkedList.next);
    }

    /*

    1->2->3->4
    1 3 4 4
     */
    //Zaki ?

    private static void removeNodeOfGivenPointer(ListNode nodeTobeDeleted) {
        while(nodeTobeDeleted.next != null) {
            nodeTobeDeleted.data = nodeTobeDeleted.next.data;
            nodeTobeDeleted= nodeTobeDeleted.next;
        }
    }
}
