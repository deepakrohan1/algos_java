package org.example.tree.bst;

import lombok.Builder;
import lombok.Data;

public class TreeHelperClass {

    public TreeNode createATreeNode () {
        TreeNode root = new TreeNode(10);
        TreeNode rootLeft = new TreeNode(6);
        TreeNode rootRight = new TreeNode(15);
        root.setLeft(rootLeft);
        root.setRight(rootRight);
        TreeNode rootLeftLeft = new TreeNode(2);
        TreeNode rootLeftRight = new TreeNode(7);
        rootLeft.setLeft(rootLeftLeft);
        rootLeft.setRight(rootLeftRight);
        TreeNode rootRightLeft = new TreeNode(11);
        TreeNode rootRightRight = new TreeNode(16);
        rootRight.setLeft(rootRightLeft);
        rootRight.setRight(rootRightRight);

        return root;

    }


}


@Data
class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}