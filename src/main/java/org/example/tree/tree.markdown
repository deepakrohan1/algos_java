# Trees

Different applications in computer sciences
* Folder Structure
* XML
* OOPS (Inheritance)
* JSON
* BST 
* B Trees and B + Trees DBMS

## BST

A tree with two child elements for a node
* The left any Node is smaller value
* The right of a binary tree is larger value

### Java Representation

```$xslt
class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node (10);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node (7);
    }
}

class Node {
    int value;
    Node leftNode;
    Node rightNode;
    int value;
    public Node (int value) {
        this.value = value;
    }
}
```

```$xslt
            10
        8       12
      5   9   11    13
```

## Tree Traversal
Printing every key once along the path
* Search Operation
* Size of the tree

### Breadth First
10, 8 , 12, 5, 9 , 11, 13

### Depth First
* Traverse Root
* Traverse left subtree
* Traverse Right subtree

```$xslt
            10
        8       12
      5   9   11    13
```

### In-order
Left, root, right

5,8,9,10,11,12,13

### Pre order
Root, Left, Right
10, 8, 5, 9, 12, 11, 13

### Post Order
Left, Right, Root
5,9, 8,11,13,12,10
