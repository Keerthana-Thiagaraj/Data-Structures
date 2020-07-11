package SortingAlgo;

//Optimized bubble sort

public class BubbleSort {

    public static void sort(int[] array) {
        int n = array.length;
        int temp;
        int flag;

        //n-1 comparisons needed for passes ,also last element will be sorted automatically
        for (int i = 0; i < n - 1; i++) {

            flag = 0;

            //n-1-i is because, comparison is not required for already sorted elements in previous passes
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {

                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 1;

                }
            }

            //In any pass, if it encounters that swapping is not done, as array gets sorted already, we are breaking the pass
            if (flag == 0)
                break;
        }
    }

    public static void display(int[] array) {
        for (int k : array) {
            System.out.println(k);
        }

    }

    public static void main(String[] args) {
        int[] array = {2, 13, 1, 8778, 211, 2123, 231};
        sort(array);
        display(array);
    }
}
