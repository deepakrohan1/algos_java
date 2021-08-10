package org.example.linked;

public class PushNNodes {

    LinkedList l;
    public Node initialize() {
        l = new LinkedList();
        l.pushNode(1);
        l.pushNode(2);
        l.pushNode(3);
        l.pushNode(4);
        l.pushNode(5);
        l.pushNode(6);
        l.pushNode(7);
        return l.head;
    }

    /**
     * [1,2,3,4,5]
     * n = 3
     * @param n
     * @return
     */
    public Node pushNNodesIn(Node n, int k) {
        int count = 1;
        Node temp = n;
        Node fast = null;
        while (temp != null) {
            temp = temp.next;

            count ++;
            if (count == 3) break;

        }
        System.out.println(temp.data);
        if (count == k) {
            fast = temp;
        }

        Node second = n;
        while (fast != null) {
            second = second.next;
            fast = fast.next;

        }

        return second;


    }



    public static void main(String[] args) {
        PushNNodes p = new PushNNodes();
        Node n = p.initialize();
        System.out.println(p.pushNNodesIn(n, 3).data);
    }
}
