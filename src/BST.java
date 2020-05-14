import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BST {

    //Recursive function for Inorder traversal.
    // Here , traversal is done on the left subtree completely,-> visit the root -> traversal is done on the right subtree completely
    // On reaching null values, entry is deleted in the call stack and
    // points to the root value previously invoked and the process continues

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }

    //Recursive function to insert values in BST
    public static Node insertKey(Node root, int value) {

        //If the root is found to be null, (i.e)node doesn't exists. Hence we are creating a new node
        if (root == null) {
            return new Node(value);
        }

        //Check for the duplicacy of the data in BST.
        if (value == root.data) {
            return root;
        }

        // If the value to be inserted is less than the root data, then go left and insert
        if (value < root.data) {
            root.left = insertKey(root.left, value);
        }
        // Else If the value to be inserted is greater than the root data, then go right and insert
        else if (value > root.data) {
            root.right = insertKey(root.right, value);
        }
        return root;

    }

    public static void main(String[] args) {

        Node root = null;
        List<Integer> keys = Stream.of(2, 8, 1, 3, 4, 3).collect(Collectors.toList());


        for (Integer key : keys) {
            root=insertKey(root,key);
        }
        inOrder(root);
    }
}
