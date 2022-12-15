package scannerandstring;

import java.util.Scanner;

public class ScannerAndString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter S1 String: ");
        String S1 = scan.nextLine();

        System.out.print("Enter S2 String: ");
        String S2 = scan.nextLine();

        System.out.println("S1: " + S1);
        System.out.print("Length: ");
        System.out.println(S1.length());

        System.out.println("S2: " + S2);
        System.out.print("Length: ");
        System.out.println(S2.length());

        System.out.println("S1: " + S1);
        S1 = S1.replace(' ', '_');
        System.out.println("Modified S1: " + S1);

        System.out.print(S1.charAt(0));
        System.out.println("   is the first character of S1.");

        S1 = S1.replace('_', ' ');
        if (S1.equals(S2)) {
            System.out.println("S1 and S2 are equal.");
        } else {
            System.out.println("S1 and S2 are not equal.");
        }

        System.out.println("First occurance of 'a' in S1 (Index): " + S1.indexOf("a"));
        System.out.println("[Note: The index -1 refers 'a' is not present in S1]");

        if (S1.contains(S2)) {
            System.out.println("S1 contains S2.");
        } else {
            System.out.println("S1 does not contain S2.");
        }

        if (S2.contains(S1)) {
            System.out.println("S2 contains S1.");
        } else {
            System.out.println("S2 does not contain S1.");
        }

        System.out.println("S1: " + S1);
        System.out.println("Lower Case S1: " + S1.toLowerCase());

        System.out.println("S2: " + S2);
        System.out.println("Upper Case S2: " + S2.toUpperCase());

        char[] Array = S1.toCharArray();
        for (char ch : Array) {
            System.out.println(ch);
        }

        //To remove the starting and ending spaces in a string
        //we use a function called trim()
        //Example (Here I've shown how to remove spacing from starting and ending edge for S1 and S2)
        System.out.println("Before Trim: " + S1);
        S1 = S1.trim() + S2;
        System.out.println("After Trim: " + S1);

        //Difference between equals() and ==
        // Reference: https://www.geeksforgeeks.org/difference-equals-method-java/
        //We can use == operators for reference comparison (address comparison) and .equals() method for content comparison.
        //In simple words, == checks if both objects point to the same memory location
        //whereas .equals() evaluates to the comparison of values in the objects.
    }

}
