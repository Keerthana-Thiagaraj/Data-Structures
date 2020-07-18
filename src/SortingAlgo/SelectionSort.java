package SortingAlgo;


//program to demonstrate selection sort
// Pick the minimum element and compare across the array and do swapping
public class SelectionSort {

    // Time complexity - O(n2)
    public static void main(String[] args) {
        int[] a = {8, 3, 10, 4, 2};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(a);

    }

    public void sort(int[] a) {

        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }

        for (int k : a) {
            System.out.println(k);
        }
    }
}
