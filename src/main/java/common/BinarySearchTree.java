package main.java.common;

public class BinarySearchTree {
    public static Node head;


    public static void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;

        while (temp != null) {
            if (data < temp.data) {
                if (temp.left == null) {
                    temp.left = new Node(data);
                    break;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = new Node(data);
                    break;
                }
                temp = temp.right;
            }

        }

    }


}
