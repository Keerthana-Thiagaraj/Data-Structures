package SortingAlgo;


public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {80, 2, 10, 1, 22};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(a);
        insertionSort.display(a);
    }

    public void display(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    public void sort(int[] a) {

        int n = a.length;
        int value = 0, j;
        for (int i = 1; i < n; i++) { // loop starts from index-1 as the 1st element is considered to be sorted

            value = a[i];
            j = i - 1; // For comparing backwards from the opted value
            while (j >= 0 && a[j] > value) {
                a[j + 1] = a[j];  // if the digit is greater than value, we are pushing towards the end of the array
                j--; // continuosly tracking backwards
            }
            a[j + 1] = value;
        }
    }
}
