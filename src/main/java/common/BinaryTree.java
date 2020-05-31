package main.java.common;


public class BinaryTree {
    public static Node n;

    public static Node getBinaryTree() {
     n = new Node();
        n.data =  10;
        n.left.data = 40;
        n.right.data = 2;
        return n;
    }
}
