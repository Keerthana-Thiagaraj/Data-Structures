package Recursion;

public class OccurenceOfDigit {

    int count = 0;

    public static void main(String[] args) {
        int n = 99999999;
        int countDigit = 7;
        OccurenceOfDigit occurenceOfDigit = new OccurenceOfDigit();

        System.out.println("" + occurenceOfDigit.countDigits(n));
    }

    public int countDigits(int no) {

        int countDigit = 7;

        int lastDigit = no % 10;
        int remainingDigits = no / 10;

        if (lastDigit == countDigit)
            count++;
        if (remainingDigits > 0) {  //setting the base condition
            countDigits(remainingDigits); //recursive call for remaining digits
        }
        return count;
    }

}

