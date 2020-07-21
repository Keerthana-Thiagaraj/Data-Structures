package LinkedList;

public class SumOfNos {
    Node head;

    public static void main(String[] args) {

        SumOfNos sumOfNos = new SumOfNos();
        int[] a = {1, 2, 3, 4};
        int[] b = {5,6};
        Node node1 = sumOfNos.createLinkedList(a);
        Node node2 = sumOfNos.createLinkedList(b);
//        sumOfNos.reverse(node1, node2);
        sumOfNos.display(sumOfNos.reverse(node1, node2));

    }

    public Node reverse(Node l1, Node l2) {
        l1 = reversedNode(l1); // reverse the nodes
        l2 = reversedNode(l2);

        return reversedNode(sum(l1, l2));
    }


    public Node sum(Node l1, Node l2) {
        head = null;
        Node prev = null;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.data;
            }
            if (l2 != null) {
                sum += l2.data;
            }
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;

            Node sumNode = new Node(sum);

            if (head == null) {
                prev = sumNode;
                head = sumNode;
            } else {
                prev.next = sumNode;
                prev = sumNode;
            }

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry != 0) {
            prev.next = new Node(carry);
        }
        return head;

    }

    public Node reversedNode(Node originalNode) {

        Node temp = originalNode;
        Node reversedNode = null;

        while (temp != null) {

            Node next = temp.next;

            //move the current node to reversed
            temp.next = reversedNode;
            reversedNode = temp;
            temp = next;

        }
        return reversedNode;
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

        Node(int value) {
            this.data = value;
            next = null;
        }
    }
}
