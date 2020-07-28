package LinkedList;

// Program to find middle element in a Linkedlist

public class FindMiddleElement {

    Node head;

    public static void main(String[] args) {

        FindMiddleElement findMiddleElement = new FindMiddleElement();
        findMiddleElement.insertAtFront(5);
        findMiddleElement.insertAtFront(4);
        findMiddleElement.insertAtFront(3);
        findMiddleElement.insertAtFront(2);
        findMiddleElement.insertAtFront(1);

        findMiddleElement.display();
        findMiddleElement.findMiddle();

    }

    public void findMiddle() {

        if (head != null) {

            Node first_ptr = head;  // Keeping 2 pointers and traversing towards end to find out middle element
            Node second_ptr = head;

            while (second_ptr != null && second_ptr.next != null) {
                first_ptr = first_ptr.next;
                second_ptr = second_ptr.next.next;
            }
            System.out.println("middle data" + first_ptr.data);
        }
    }

    public void insertAtFront(int data) {

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
