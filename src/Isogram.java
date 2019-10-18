
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public Isogram() {

    }

    public static void main(String[] args) {

        // todo learn unit testing and dive in TDD
        System.out.println("This should return false: " + Isogram.isIsogramEfficient("machineM"));
        System.out.println("This should return true: " + Isogram.isIsogramEfficient("machine"));
        System.out.println("This should return true: " + Isogram.isIsogramEfficient(""));

        Isogram iso = new Isogram();
        System.out.println(iso.squareDigits(44));
    }

    public static boolean isIsogramEfficient(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }

    /**
     * Converts the input into an array then converts that array into a List. Set keeps only unique values.
     * By comparing both you can check if duplicate characters are present
     *
     * @param s the String which is checked if it's a isogram
     * @return true when param s is a isogram
     */
    private boolean isIsogram(String s) {
        // Ignore letter case
        s = s.toLowerCase();
        // Store each char of the word(s)
        String[] words = s.split("");

        // Convert array to a List and then create a Set from that List.
        // Set keeps only unique values.
        Set<String> set = new HashSet<String>(Arrays.asList(words));

        // returns false when duplicate character(s) occur
        if (s.length() == set.size()) {
            return true;
        } else if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Welcome. In this kata, you are asked to square every digit of a number.
     *
     * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
     *
     * Note: The function accepts an integer and returns an integer
     */

    public int squareDigits(int n) {
        String result = "";
        for (char c : String.valueOf(n).toCharArray()) {

            result += (int) Math.pow(Integer.valueOf(String.valueOf(c)), 2);
        }
        return Integer.valueOf(result);
    }


    /*
     * A different approach to compare each char in a string
     *
     *
     * static boolean isIsogram(String str) {
     *
     * // Convert the string in lower case letters
     * str = str.toLowerCase();
     * int len = str.length();
     * <p>
     * char arr[] = str.toCharArray();
     * <p>
     * Arrays.sort(arr);
     * for (int i = 0; i < len - 1; i++) {
     * if (arr[i] == arr[i + 1])
     * return false;
     * }
     * return true;
     * }
     */

}
