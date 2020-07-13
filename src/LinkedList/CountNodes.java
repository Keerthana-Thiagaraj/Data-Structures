package LinkedList;


//Program to find total no of nodes in a Singly linked list

public class CountNodes {
    Node head;

    public static void main(String[] args) {

        CountNodes countNodes = new CountNodes();
        countNodes.insertAtFront(2);
        countNodes.insertAtFront(8);
        countNodes.insertAtFront(22);
        countNodes.insertAtFront(23);
        countNodes.insertAtFront(29);
        System.out.println("total nodes " + countNodes.count());

    }

    public int count() {


        //Iterative way
//        Node temp = head;
//        int count = 0;
//        while (temp != null) {
//            count++;
//            temp = temp.next;
//        }
//        return count;

        return getCountOfNodesRecur(head);
    }

    //Recursive function

    public int getCountOfNodesRecur(Node node) {

        if (node == null) {
            return 0;
        } else
            return 1 + getCountOfNodesRecur(node.next);

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
