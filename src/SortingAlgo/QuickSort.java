package SortingAlgo;

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] a, int start, int end) {

        //check the boundaries
        if (start < end) {
            //Declare the index positions for moving to next elements
            int i, j;

            /*Assign the pivot  as 1st element */
            int pivot = a[start];

            /*Initially assigning indices to beginning and end of array */
            i = start;
            j = end;

            //* Recursively calls only if left side index is lesser than right side elements */
            while (i < j) {

                /* Check from the element next to pivot*/
                i = i + 1;

                // check recursively if the elements is lesser, if its true, increment to next index and continue accordingly
                while (a[i] < pivot) {
                    i++;
                }

                //Check from reverse if elements are greater, if its true, decrement to next index and continue accordingly
                while (a[j] > pivot) {
                    j--;
                }

                // At one stage , if the above conditions are stopped, swap the elements
                if (i < j) {
                    swap(a, i, j);
                }
            }

            // On exit of above condition, j value comes before i value, in that case, swap pivot and j element
            swap(a, start, j);
            // Recursive calls based on the partitioning of pivot element
            sort(a, start, j - 1);
            sort(a, j + 1, end);

        }


    }

    public static void swap(int[] a, int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {

        int[] array = {21, 1, 28, 3, 8, 89, 23};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

}
