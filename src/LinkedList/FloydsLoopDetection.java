package LinkedList;


//Time complexity-O(n)
//Space complexity- O(1)

public class FloydsLoopDetection {

    Node head;

    public static void main(String[] args) {

        FloydsLoopDetection floysLoopDetection = new FloydsLoopDetection();
        floysLoopDetection.insertAtFront(12);
        floysLoopDetection.insertAtFront(34);
        floysLoopDetection.insertAtFront(32);
        floysLoopDetection.insertAtFront(34);
        floysLoopDetection.insertAtFront(13);

        //Establishing a loop in list
        floysLoopDetection.head.next.next.next.next = floysLoopDetection.head.next;

        floysLoopDetection.detectLoop();

    }

    public void detectLoop() {

        // Two pointers are used. One pointer will be pointed to head 1st and fast pointer will move ahead in 2 steps.
        // At one stage, if pointers meet each other, loop has been found.

        Node slow_pointer = head;
        Node fast_pointer = head;
        int flag = 0;
        while (slow_pointer != null && fast_pointer != null && fast_pointer.next != null) {

            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
            if (slow_pointer == fast_pointer) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("loop detected");
        } else {
            System.out.println("loop not found");
        }

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
