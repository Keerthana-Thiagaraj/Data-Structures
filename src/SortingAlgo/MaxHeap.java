package SortingAlgo;

import java.util.Arrays;
import java.util.NoSuchElementException;

//A program to implement MaxHeap
public class MaxHeap {

    // Initial size of Heap is 0
    int size = 0;
    int capacity;
    int[] heap;

    public MaxHeap(int capacity) {

        this.capacity = capacity;
        this.heap = new int[capacity];
    }

    public static void main(String[] args) {

        MaxHeap maxHeap = new MaxHeap(6);
        maxHeap.addElements(5);
        maxHeap.addElements(3);
        maxHeap.addElements(17);
        maxHeap.poll();
//        maxHeap.addElements(2);
//        maxHeap.addElements(33);
//        maxHeap.addElements(22);
//        System.out.println("top" + maxHeap.peek());
        maxHeap.displayHeap();
    }

    //Driver methods to check if the added element has parent node,left child node,right child node -Lines 35-45
    public boolean checkElementHasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    public boolean checkElementHasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    public boolean checkElementHasRightIndex(int index) {
        return getRightChildIndex(index) < size;
    }

    //Driver methods to fetch the parent index, left child index, right child index based on the formulae-Lines-49-59

    public int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    public int getRightChildIndex(int index) {
        return 2 * index + 2;
    }

    public int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    //Driver methods to fetch the parent element, left child and right child element -Lines-62-72
    private int getParentElement(int index) {
        return heap[getParentIndex(index)];
    }

    private int getLeftChild(int index) {
        return heap[getLeftChildIndex(index)];
    }

    private int getRightChild(int index) {
        return heap[getRightChildIndex(index)];
    }

    //Function to swap the elements inorder to maintain heapify property

    public void swapElements(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    // Function to heapify the tree whenever new element is inserted

    public void heapifyUp() {
        int index = size - 1;
        while (checkElementHasParent(index) && getParentElement(index) < heap[index]) {
            swapElements(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    // Function to heapify the subtree whenever the head node element is removed

    public void heapifyDown() {
        int index = 0;

        while (checkElementHasLeftChild(index)) {
            int smallestChildIndex = getLeftChildIndex(index);
            if (checkElementHasRightIndex(index) && getRightChild(index) > getLeftChild(index)) {
                smallestChildIndex = getRightChildIndex(index);
            }
            if (heap[index] < heap[smallestChildIndex]) {
                swapElements(index, smallestChildIndex);
            } else {
                break;
            }
            index = smallestChildIndex;
        }
    }

    //constant time complexity- > O(1)
    private int peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return heap[0];

    }

    //Remove the top element-and heapify the tree again
    public void poll() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        heap[0] = heap[size - 1];
        heap[size - 1] = 0;
        size--;
        heapifyDown();
    }

    private void displayHeap() {

        for (int i : heap) {
            System.out.println(i);
        }
    }

    // Insert new elements and increasing the size of the heap accordingly.

    public void addElements(int element) {
        checkCapacity();
        heap[size] = element;
        size++;
        heapifyUp();
    }

    //Array is checked for full condition

    public void checkCapacity() {
        if (size == capacity) {

            heap = Arrays.copyOf(heap, capacity * 2);
            capacity = capacity * 2;

        }
    }
}