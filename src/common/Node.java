package common;

public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

}
