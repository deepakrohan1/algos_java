package org.example.cracking.code.arrays.linkedlist;

import org.example.cracking.code.arrays.linkedlist.helper.SingleLinkedList;
import org.example.cracking.code.arrays.linkedlist.helper.SingleLinkedNode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesLL {

    public SingleLinkedNode removeNodeFromMid(SingleLinkedNode head, int val) {

        SingleLinkedNode curr = head;
        SingleLinkedNode prev = null;

        while (curr != null) {
            if (curr.data == val) {
                prev.next = curr.next;
            } else
                prev = curr;

            curr = curr.next;
        }

        return head;
    }

    public SingleLinkedNode removeDuplicates(SingleLinkedNode node) {
        SingleLinkedNode curr = node;
        SingleLinkedNode prev = curr;
        Set<Integer> data = new HashSet<Integer>();

        while (curr != null) {
            if (data.contains(curr.data)) {
                // Duplicate Logic
                prev.next = curr.next;
            } else {
                data.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }

        return node;

    }

    public static void main(String[] args) {
        RemoveDuplicatesLL removeDuplicates = new RemoveDuplicatesLL();
        SingleLinkedList singleNodeLinkedList = new SingleLinkedList();
        System.out.println(singleNodeLinkedList.getNode());
        System.out.println(removeDuplicates.removeDuplicates(singleNodeLinkedList.getNode()));
        System.out.println(removeDuplicates.removeNodeFromMid(singleNodeLinkedList.getNode(), 4));
        System.out.println(removeDuplicates.removeNodeFromMid(singleNodeLinkedList.getNode(), 5));
    }

}
