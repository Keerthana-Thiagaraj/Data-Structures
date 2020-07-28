package LinkedList;

// Program to remove an element at a given position from backwards

public class RemoveNthNodeFromEnd {
    Node head;

    public static void main(String[] args) {

        RemoveNthNodeFromEnd removeNthNodeFromEnd = new RemoveNthNodeFromEnd();
        removeNthNodeFromEnd.insertAtFront(5);
        removeNthNodeFromEnd.insertAtFront(4);
        removeNthNodeFromEnd.insertAtFront(3);
        removeNthNodeFromEnd.insertAtFront(2);
        removeNthNodeFromEnd.insertAtFront(1);

        removeNthNodeFromEnd.reverse();
        removeNthNodeFromEnd.deleteNode(2);
        removeNthNodeFromEnd.display();

    }


    public void deleteNode(int n) {

        Node temp = head;
        if (temp == null)
            return;

        if (n == 0)
            head = temp.next;

        for (int i = 1; temp != null && i < n - 1; i++) {
            temp = temp.next; // Traversing till the given position
        }

        Node nextNode = temp.next.next; // saving the next next value inorder to remove the element at the given position
        temp.next = nextNode;
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
