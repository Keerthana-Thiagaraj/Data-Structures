package SortingAlgo;


class Node {

    int val;
    Node left;
    Node right;

    Node() {

    }

    Node(int value) {
        this.val = value;
    }

    Node(int value, Node leftNode, Node rightNode) {
        this.left = leftNode;
        this.right = rightNode;
    }
}


public class MaximumBinaryTree {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 6, 0, 5};
        constructMaximumBinaryTree(nums);
    }

    public static Node constructMaximumBinaryTree(int[] nums) {

        return createMaxTree(nums, 0, nums.length - 1);
    }

    public static Node createMaxTree(int[] nums, int start, int end) {

        if (end < start)
            return null;
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        Node node = new Node(max);
        Node l = createMaxTree(nums, start, index - 1);
        Node r = createMaxTree(nums, index + 1, end);
        node.left = l;
        node.right = r;
        return node;
    }
}
