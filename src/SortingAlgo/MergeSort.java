package SortingAlgo;

public class MergeSort {

    public static int[] sort(int[] a) {

        int length = a.length;
        int[] res = new int[length];

        if (length <= 1)  // Returning the original array if the length<1
            return a;

        int mid = length / 2;  //Find mid element

        /* Declare left and right subarrays */
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        /*Allocating left and right subarrays*/

        for (int x = 0; x < mid; x++) {
            left[x] = a[x];
        }
        for (int y = 0; y < right.length; y++) {
            right[y] = a[mid + y];
        }

        /*Recursive calls till we obtain sorted left and right subarrays*/
        left = sort(left);
        right = sort(right);

        /*Merging the sorted left and right subarrays*/
        res = merge(left, right);

        return res;
    }

    public static int[] merge(int[] left, int[] right) {

        // Result will be combination of left and right subarrays
        int[] result = new int[left.length + right.length];

        //Declaring indices of left, right and resultant arrays
        int i, j, k;
        i = j = k = 0;

        // Check if there elements in either left or right subarray
        while (i < left.length || j < right.length) {

            // Incase there are elements in both subarrays, find out which is smaller by comparing both
            if (i < left.length && j < right.length) {

                if (left[i] < right[j]) {
                    result[k++] = left[i++];
                } else {
                    result[k++] = right[j++];
                }
            } else if (i < left.length) {  // If there are elements only in left subarray
                result[k++] = left[i++];
            } else if (j < right.length) { // If there are elements only in right subarray
                result[k++] = right[j++];
            }
        }
        return result;

    }

    public static void display(int[] sortedResult) {

        for (int sort : sortedResult) {
            System.out.println(sort);
        }

    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 21112, 22221, 221211, 3343242, 31232131, 221, 2121, 2, 1};
        array = sort(array);
        display(array);
    }
}
