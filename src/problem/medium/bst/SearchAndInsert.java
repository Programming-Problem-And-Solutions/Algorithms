package problem.medium.bst;

import common.BinarySearchTree;
import common.TreeTraverseUtil;

public class SearchAndInsert {

    public static void main(String[] args) {
        BinarySearchTree.insert(1);
        BinarySearchTree.insert(2);
        BinarySearchTree.insert(3);
        BinarySearchTree.insert(4);
        BinarySearchTree.insert(5);

        TreeTraverseUtil.inorder(BinarySearchTree.head);
    }
}
