import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    static boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] char1 = string1.toCharArray();
        char[] char2 = string2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1, char2);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String firstString;
        String secondString;

        while (true) {
            System.out.println("Enter the first string: ");
            firstString = in.nextLine();
            System.out.println("Enter the second string: ");
            secondString = in.nextLine();

            if (isAnagram(firstString, secondString)) {
                System.out.println("\n" + firstString + " and " + secondString + " are anagrams.\n");
            } else {
                System.out.println("\n" + firstString + " and " + secondString + " are not anagrams.\n");
            }
        }
    }
}
