package LinkedList;


// Program to merge 2-sorted lists (leetcode problem)

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4, 5, 6};

        Node l1 = mergeTwoSortedLists.createLinkedList(a);
        Node l2 = mergeTwoSortedLists.createLinkedList(b);
        Node l3 = mergeTwoSortedLists.mergeLists(l1, l2);
        mergeTwoSortedLists.display(l3);
    }

    public Node mergeLists(Node l1, Node l2) {

        Node l4 = new Node();
        Node merged = l4;  // Creating new node for manipulations

        while (l1 != null && l2 != null) {

            if (l1.data <= l2.data) {  // checking if the 1st list value is lesser than 2nd list
                merged.next = new Node(l1.data); // If true, create a new node and append to merged list
                l1 = l1.next; // Traverse the remaining elements
            } else {
                merged.next = new Node(l2.data);
                l2 = l2.next;
            }
            merged = merged.next; // Move forward in the merged list
        }

        // In case the lists are of unequal size, we are appending the remaining elements

        if (l1 == null)
            merged.next = l2;
        if (l2 == null)
            merged.next = l1;

        return l4.next;
    }

    public Node insertNode(Node root, int val) {

        Node t = new Node(val);
        Node ptr;

        if (root == null) {
            root = t;
        } else {
            ptr = root;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = t;
        }
        return root;


    }

    public Node createLinkedList(int[] data) {
        Node root = null;
        for (int i = 0; i < data.length; i++) {
            root = insertNode(root, data[i]);
        }
        return root;
    }

    public void display(Node head) {

        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    static class Node {

        int data;
        Node next;

        Node() {  // Creating an empty node

        }

        Node(int value) {   // Creating node with passed values
            this.data = value;
            next = null;
        }
    }

}
