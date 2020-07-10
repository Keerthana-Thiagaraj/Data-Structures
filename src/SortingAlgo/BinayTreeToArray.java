package SortingAlgo;

//* Construction of an array from a Binary Tree -Sequential Representation*//

class ArrayImpl {

    static int root = 0;
    String[] btToArray = new String[6];

    // Create a root node
    public void createRoot(String key) {
        btToArray[0] = key;
    }

    // Set the left child values based on root value

    public void setLeftChild(String key,int root) {
        int index = (2 * root) + 1;
        if (btToArray[root] == null) {
            System.out.println("Cant set child at" + index + "no parent found");
        } else {
            btToArray[index] = key;
        }
    }

    //Set the right child values based on root value
    public void setRightChild(String key,int root) {
        int index = (2 * root) + 2;
        if (btToArray[root] == null) {
            System.out.println("Cant set child at" + index + "no parent found");
        } else {
            btToArray[index] = key;
        }
    }

    public void displayArray() {
        for (String i : btToArray) {
            if (i != null) {
                System.out.println(i);
            } else {
                System.out.println("-");
            }
        }
    }
}

public class BinayTreeToArray {
    public static void main(String[] args) {
        ArrayImpl array = new ArrayImpl();
        array.createRoot("1");
        array.setLeftChild("2",1);
        array.setRightChild("3",1);
        array.setLeftChild("4",1);
        array.displayArray();

    }
}
