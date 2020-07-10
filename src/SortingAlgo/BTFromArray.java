package SortingAlgo;

//* Construction of a Complete Binary tree from an Array*//

public class BTFromArray {

    Node root;

    public static void main(String[] args) {
        BTFromArray btFromArray = new BTFromArray();
        int[] array = {1, 2, 3, 4, 5, 6};
        btFromArray.root = btFromArray.insertOrder(array, btFromArray.root, 0);
        btFromArray.inorder(btFromArray.root);
    }

    public Node insertOrder(int[] array, Node root, int i) {
        if (i < array.length) {
            //Create a node first
            Node t = new Node(array[i]);
            root = t;

            //Recursive calls to place elements in left and right side by applying the below formulae
            //For element in the array, the calls are made
            root.left = insertOrder(array, root.left, 2 * i + 1);
            root.right = insertOrder(array, root.right, 2 * i + 2);
        }
        return root;
    }

    public void inorder(Node root) {
        //Inorder traversal
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data + "");
            inorder(root.right);
        }
    }

    //Creation of a Node
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
