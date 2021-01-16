package org.example.ds;

import java.util.*;
import java.util.Stack;

public class BinarySearchTree {
    BinaryNode root;


    public void insertRecu(Integer value) {
        if (this.root == null) {
            this.root = new BinaryNode(value);
        } else {
            recInsert(this.root, value);
        }
    }

    public void recInsert(BinaryNode node, Integer value) {

        BinaryNode current = node;
        if (current != null) {
            if (value > node.value) {
                recInsert(current.right, value);
            } else {
                recInsert(current.left, value);
            }
        } else
            current = new BinaryNode(value);

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
       b.insert(10);
       b.insert(22);
       b.insert(8);
       b.insert(9);
       b.insert(9);
        System.out.println(b.root);
        System.out.println(b.findNode(23));
        System.out.println(b.breadthFirstSearch());
		b.depthFirstPreOrder();
        System.out.println("=========");
		b.helperPostOrder(b.root);

    }

}
