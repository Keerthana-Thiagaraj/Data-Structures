package Recursion;

//Program to count substrings abc & aba recursively

public class CountSubStrings {

    int c = 0;
    String appendWord = "";

    public static void main(String[] args) {
        CountSubStrings countSubStrings = new CountSubStrings();
        String word = "abcbabcdda";
        System.out.println("" + countSubStrings.countSubstringsInAWord(word));
    }

    public int countSubstringsInAWord(String word) {

        if (word.length() < 3)
            return 0;
        else if (word.substring(0, 3).equals("abc") || word.substring(0, 3).equals("aba"))
            return 1 + countSubstringsInAWord(word.substring(2));
        else
            return countSubstringsInAWord(word.substring(1));

//
//        String regex1 = "abc";
//        String regex2 = "aba";
//
//        appendWord.concat(word.substring(word.length() - 1));
////        System.out.println(word.substring(word.length() - 1));
////        String w = word.substring(word.length() - 3);
//        if (appendWord.length() > 0) {
//            if (appendWord.matches(regex1) || appendWord.matches(regex2)) {
//                c++;
//            }
//        }
//        countSubstringsInAWord(word.substring(word.length() - 1));
//        System.out.println("count" + c);
//
    }
}
