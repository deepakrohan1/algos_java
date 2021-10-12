package org.example.tree.bst;

public class BSTBasicOps {

    /**
     * In order Traversal L - C- R
     * @param args
     */
    public static void inOrderTraversal(TreeNode node) {

        if (node == null) return;

        inOrderTraversal(node.getLeft());
        System.out.println(node.getVal());
        inOrderTraversal(node.getRight());


    }

    public static void main(String[] args) {
        TreeHelperClass tree = new TreeHelperClass();
        inOrderTraversal(tree.createATreeNode());
    }




    /**
     * SEARCH BST
     *      if (n == null) return -1
     *      if (n.val == target) return n;
     *    or
     *  else
     *      if node vl is < target
     *          search(n.left, target)
     *      else
     *          search(n.right, target)
     *
     */

    /**
     * INSERT INTO BST
     * if (n == null) n = new Node(target)
     * else
     *  if (n.val > target)
     *      insert(n.left)
     *  else
     *      insert(n.right)
     */



}
