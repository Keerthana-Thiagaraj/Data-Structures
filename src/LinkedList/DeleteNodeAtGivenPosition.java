package LinkedList;

//A program to delete a node at a given position

public class DeleteNodeAtGivenPosition {

    Node head;

    public static void main(String[] args) {

        DeleteNodeAtGivenPosition deleteNodeAtGivenPosition = new DeleteNodeAtGivenPosition();
        deleteNodeAtGivenPosition.insertAtFront(23);
        deleteNodeAtGivenPosition.insertAtFront(45);
        deleteNodeAtGivenPosition.insertAtFront(56);
        deleteNodeAtGivenPosition.insertAtFront(12);
        deleteNodeAtGivenPosition.deleteAtPosition(1);
        deleteNodeAtGivenPosition.display();

    }

    //Time complexity of O(1). New node becomes the head node
    public void insertAtFront(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteAtPosition(int pos) {

        Node val = head;
        //No nodes in the list
        if (head == null) {
            return;
        }
        //If head node to be removed-keep the head as val.next
        if (pos == 0) {
//            System.out.println("pos is head");
            head = val.next;
        }

        //Traverse till pos-1 and point that last val to next node. val.next is the node to be deleted.

        for (int i = 0; val != null && i < pos - 1; i++) {
            val = val.next;
        }

        //Save the next value to other node,to remove this and point it to prev node

        Node nextNode = val.next.next;
        val.next = nextNode;
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
