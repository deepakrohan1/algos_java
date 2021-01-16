package org.example.ds;

import java.util.*;
import java.util.Stack;

public class BinarySearchTree {
    BinaryNode root;


    public void insertRecu(Integer value) {
      BinaryNode current = this.root;

      this.root = recInsert(current, value);
    }

    public BinaryNode recInsert(BinaryNode node, Integer value) {
        if (node == null) {
            return new BinaryNode(value);
        }
        if (value < node.value) {
            //left
            node.left = recInsert(node.left, value);
        }

        if (value > node.value) {
            node.right = recInsert(node.right, value);

        }

        return node;
    }

    public BinaryNode findNodeRecu(Integer value) {
       return findNodeByRecursionMethod(this.root, value);
    }
    

    public BinaryNode findNodeByRecursionMethod(BinaryNode node, Integer value) {
        if (node == null) {
            return null;
        }

        if (value > node.value) 
            return findNodeByRecursionMethod(node.right, value);

        if (value < node.value)
            return findNodeByRecursionMethod(node.left, value);

        return null;
    }
    public void insert(int value) {
        BinaryNode newNode = new BinaryNode(value);

        if (this.root == null) {
            this.root = newNode;
        } else {
            BinaryNode current = this.root;
            while (true) {
                if (value < current.value) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (value > current.value) {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    } else {
                        current = current.right;
                    }
                } else if (current.value == value){
                    System.out.println("inserting a duplicate");
                    break;

                }
            }
        }
    }

    public List<Integer> breadthFirstSearch() {
        Queue<BinaryNode> q = new LinkedList<>();
        List<Integer> dataElem = new ArrayList<>();

        BinaryNode currentNode = this.root;
        q.add(currentNode);

        while(q.size() > 0) {
            currentNode = q.remove();
            dataElem.add(currentNode.value);
            if (currentNode.left != null) q.add(currentNode.left);
            if (currentNode.right != null) q.add(currentNode.right);
        }

        return dataElem;
    }
	
	public void depthFirstPreOrder() {
		
		
		helperFunction(this.root);
		
	}

	public void depthFirstPostOrder() {

    }

    public void helperPostOrder(BinaryNode node) {
        List<Integer> data = new ArrayList<>();
        if (node.left != null) helperPostOrder(node.left);
        if (node.right != null) helperPostOrder(node.right);

        System.out.println(node);
        data.add(node.value);
    }
	
	
	private void helperFunction(BinaryNode node) {
		List<Integer> data = new ArrayList<>();
		data.add(node.value);
        System.out.println(node);
		
		if (node.left != null) {
			helperFunction(node.left);
		}
		if (node.right != null) {
			helperFunction(node.right);
		} 
		
//		return data;

	}

	public BinaryNode findNode (int value) {
		if (this.root == null) 
			return null;
		
		BinaryNode current = this.root;
		while (true) {
			if (value > current.value) {
				if (current.right != null) {
					current = current.right;
				} else {
				    break;
                }
			} else if (value == current.value) {
				return current;
			} else if (value < current.value) {
				if (current.left != null) {
					current = current.left;
				} else {
				    break;
                }
			}
		}
		return null;
	}

    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
       b.insertRecu(10);
       b.insertRecu(22);
       b.insertRecu(8);
       b.insertRecu(9);
       b.insertRecu(9);
        System.out.println(b.findNodeRecu(9));
        System.out.println(b.root);
        System.out.println(b.findNode(23));
        System.out.println(b.breadthFirstSearch());
		b.depthFirstPreOrder();
        System.out.println("=========");
		b.helperPostOrder(b.root);

    }

}
