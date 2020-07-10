package SortingAlgo;


//Max-Heap-> Root node is always greater than its child node values
//Max-Heap-> Always satisfies a complete binary tree condition
// Complete Binary Tree-> Every node has utmost 2 child nodes, and all the leaf nodes will be moved to leftmost in the last level

public class HeapSort {

    public static void sort(int[] array, int n) {

        //Building the max heap from non leaf node
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        //Remove the element from last in max-heap
        for (int i = n - 1; i >= 0; i--) {
            // Swap the root element with the removed element
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            //Again build the max heap on reduced part
            heapify(array, i, 0);
        }

    }

    // Build the max heap
    public static void heapify(int[] array, int n, int index) {

        int largest = index;
        int left = (2 * index) + 1;
        int right = (2 * index) + 2;

        // Left value should be lesser than n anytime and lesser that largest value, else, largest pointer is changed

        while (left < n && (array[left] > array[largest])) {
            largest = left;
        }

        // Right value should be lesser than n anytime and lesser that largest value, else, largest pointer is changed

        while (right < n && (array[right] > array[largest])) {
            largest = right;
        }

        // In any case, pointers are changed, swapping of the values are done
        // And again, heapify is called recursively on the largest pointer value
        if (largest != index) {

            int temp = array[largest];
            array[largest] = array[index];
            array[index] = temp;
            heapify(array, n, largest);
        }
    }

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 612,21,123,2112,999,76767,121,9, 7};
        sort(array, array.length);
        display(array);

    }
}
