
import java.util.Arrays;
import java.util.Scanner;

public class AnagramStringCheck {

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare sorted arrays
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String input1 = SC.nextLine();

        System.out.print("Enter Second String: ");
        String input2 = SC.nextLine();

        boolean result = areAnagrams(input1, input2);

        System.out.println("Result  : " + result);
        SC.close();
    }
}

