/**
 * Problem: Take two integers and print the greater number using the relational (>) and equality (==) operators.
 */

import java.util.Scanner;

public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        // Example usage of the GreatestOfTwoNumbers class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        
        if(num1 >num2) {
            System.out.println("The greatest number is: " + num1);
        } else if(num2 > num1) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}