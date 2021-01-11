package org.example.ds;

public class BinarySearchTree {
    BinaryNode root;

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

    }

}
