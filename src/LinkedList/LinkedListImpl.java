package LinkedList;

//Insertion of a node in the beginning, middle and end of LinkedList

public class LinkedListImpl {

    Node head;

    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        linkedList.head.next = second;
        second.next = third;
        linkedList.insertAtFront(9);
        linkedList.insertMiddle(linkedList.head.next, 10);
        linkedList.insertEnd(20);

        linkedList.display();

    }

    //Time complexity of O(1). New node becomes the head node
    public void insertAtFront(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertMiddle(Node prevNode, int data) {

        //Time complexity of O(1).

        if (prevNode == null) {
            System.out.println("given node cant be null");
            return;
        }
        Node newNode = new Node(data);

        //Already prevnode->next will be pointed to its next node, so we are injecting in between.
        // Now, newnode-> next will be  pointed to existing pointed value of prevnode->next

        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    //Time complexity- O(n)

    public void insertEnd(int value) {

        Node newNode = new Node(value);

        // If head is null, then new node will be the only node
        if (head == null) {
            head = newNode;
            return;
        }

        //Making the next of only node as null
        newNode.next = null;

        // Else , it means there is a node already present,hence traversing entirely until
        // last node next is not encountered as null

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        return;
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    static class Node {

        int data;
        Node next;

        Node(int value) {
            this.data = value;
            next = null;
        }
    }
}
