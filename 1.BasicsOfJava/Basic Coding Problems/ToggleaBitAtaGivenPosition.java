/**
 * : Write a program that toggles (flips) the bit at the given position in an integer using bitwise XOR
 */
import java.util.Scanner;

public class ToggleaBitAtaGivenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        System.out.println("Enter the position to toggle:");
        int position = sc.nextInt();
        sc.close();
        // Ensure the position is valid (0-based index)
        if (position < 0 || position >= 32) {
            System.out.println("Invalid position. Please enter a position between 0 and 31.");
            return;
        }
        System.out.println("Original number: " + number);
        // Toggle the bit at the given position
        number = number ^ (1 << position);
        System.out.println("Number after toggling bit at position " + position + ": " + number);
    }
}
