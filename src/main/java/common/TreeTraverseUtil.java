package main.java.common;

import main.java.common.Node;

public class TreeTraverseUtil {


    public static void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }
}
