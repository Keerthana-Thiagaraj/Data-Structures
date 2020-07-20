package LinkedList;

public class ReverseLinkedList {
    Node head;

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.insertAtFront(21);
        reverseLinkedList.insertAtFront(31);
        reverseLinkedList.insertAtFront(34);
        reverseLinkedList.insertAtFront(44);
        reverseLinkedList.insertAtFront(67);
        reverseLinkedList.reverse();
        reverseLinkedList.display();

    }


    public void reverse() {

        Node prev, current, nextNode;
        prev = null;
        current = nextNode = head;
        while (nextNode != null) {
            nextNode = nextNode.next; // storing next node value before breaking the link
            current.next = prev; // While traversing forwards, link should be pointed to prev node value
            prev = current; // For traversing purpose, current will become prev node and process continues
            current = nextNode; // before establishing link, current and next will be the same
        }
        head = prev; // Finally, we are changing the head pointer
    }

    //Time complexity of O(1). New node becomes the head node
    public void insertAtFront(int data) {

        //Each inserted node will become node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
