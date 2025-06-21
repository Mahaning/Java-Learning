
/**
 * Problem: Use the modulo operator % or ternary opertor to check whether a number is even or odd.
 */
import java.util.Scanner;

public class CheckEvenorOdd {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd:");
        int intNumber = sc.nextInt();
System.out.println((intNumber & 1) == 1 ? 
    "The number " + intNumber + " is odd." : 
    "The number " + intNumber + " is even."); 
    sc.close();   
}
}
