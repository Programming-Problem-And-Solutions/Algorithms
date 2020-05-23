package common;

// todo
public class DoublyLinkedList extends Node {
    static Node head;

    static public void add(int data) {
        if (head == null) {
            new Node(data);
        }
        Node temp = head;
        while (temp.right != null) {
            temp.right =  new Node(data);
        }
    }

}
