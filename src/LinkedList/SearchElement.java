package LinkedList;

//Search a given element

public class SearchElement {

    Node head;

    public static void main(String[] args) {
        SearchElement searchElement = new SearchElement();
        searchElement.insertAtFront(23);
        searchElement.insertAtFront(21);
        searchElement.insertAtFront(33);
        searchElement.insertAtFront(89);
        System.out.println("" + searchElement.searchElement(89));

    }

    public boolean searchElement(int value) {

        Node t = head;

        while (t != null && t.next != null) {
            if (t.data == value)
                return true;
            t = t.next;
        }
        return false;
    }

    //Time complexity of O(1). New node becomes the head node
    public void insertAtFront(int data) {

        //Each inserted node will become node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
