package Recursion;

//Program to reverse a string recursively

public class ReverseString {
    public static void main(String[] args) {
        String reverseStr = "java";
        ReverseString reverseString = new ReverseString();
        char[] chars = reverseStr.toCharArray();
        reverseString.reverse(chars, 0, reverseStr.length() - 1);
        reverseStr=new String(chars);
        System.out.println(reverseStr);
    }

    public void swap(char[] chars, int low, int high) {

        char t = chars[low];
        chars[low] = chars[high];
        chars[high] = t;

    }

    public void reverse(char[] c, int start, int end) {

        if (start < end) {
            swap(c,start,end); // checking the position of index and swapping
            reverse(c,start+1,end-1); // traversing forward and backward while reversing recursively

        }
    }
}
