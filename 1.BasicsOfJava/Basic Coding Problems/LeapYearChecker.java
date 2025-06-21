
/**
 * Problem: Use logical and arithmetic operators to check whether a given year is a leap year.
 */
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year:");
        int intYear=sc.nextInt();
        if(intYear%4==0 && intYear%100!=0||intYear%400==0){
            System.out.println(intYear + " is a leap year.");
        } else {
            System.out.println(intYear + " is not a leap year.");
        }
    }
}
