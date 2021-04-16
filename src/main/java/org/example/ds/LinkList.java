package org.example.ds;

public class LinkList {

    Nod head;

    public Nod reverseLinkList() {
        Nod prev = null;
        Nod current = this.head;

        while(current != null) {
            Nod next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

//        this.head = current;
        return prev;
    }

    public Nod addData(int data) {
        Nod newNod = new Nod(data);
        if (this.head == null) {
            this.head = newNod;
            return this.head;
        }
        Nod current = this.head;
        while (current != null && current.next != null) {
            current = current.next;
        }
        current.next = newNod;
        return current;
    }

    public static void main(String[] args) {
        LinkList li = new LinkList();
        li.addData(10);
        li.addData(11);
        li.addData(12);
        li.addData(13);
        System.out.println(li.head);
        System.out.println(li.reverseLinkList());
    }

}

class Nod {
    Nod next;
    int data;

    Nod(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Nod{" +

                "data=" + data +
                ", next=" + next +
                '}';
    }
}