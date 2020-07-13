package LinkedList;

// Delete the first appearance of a given key

public class DeleteGivenKey {
    Node head;

    public static void main(String[] args) {
        DeleteGivenKey deleteGivenKey = new DeleteGivenKey();
        deleteGivenKey.insertAtFront(45);
        deleteGivenKey.insertAtFront(67);
        deleteGivenKey.insertAtFront(213);
        deleteGivenKey.insertAtFront(33);

        deleteGivenKey.deleteNodeOfGivenKey(33);
        deleteGivenKey.display();

    }

    //Time complexity of O(1). New node becomes the head node
    public void insertAtFront(int data) {

        //Each inserted node will become node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteNodeOfGivenKey(int key) {

        // Initially , we are pointing val to head which keeps changed later

        Node val = head;
        Node prev = null;

        // If head contains the key, return it
        if (val != null && val.data == key) {

            head = val.next;
            return;
        }
        //If head is not having the key, we are traversing the other nodes, by changing val and prev pointers.
        //prev becomes val and val gets updated to next node continuously

        while (val != null && val.data != key) {
            prev = val;
            val = val.next;
        }

        //No nodes in the list
        if (head == null) {
            System.out.println("no node");
            return;
        }

        // Removing the key from the list by changing the pointers-prev and val
        prev.next = val.next;
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
