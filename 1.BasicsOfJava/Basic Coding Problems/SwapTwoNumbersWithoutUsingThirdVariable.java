
import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:"); 
        int num2 = sc.nextInt();
        System.out.println("Before  swapping: num1 = " + num1 + ", num2 = " + num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Using Additional operations swapping: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("Before  swapping: num1 = " + num1 + ", num2 = " + num2);

        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("After Using Bitwise operations swapping: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("Before  swapping: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 * num2;
        num2=num1/num2;
        num1=num1/num2;
        System.out.println("After Using Multiplication and Division operations swapping: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("Before  swapping: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;
        System.out.println("After Using Subtraction operations swapping: num1 = " + num1 + ", num2 = " + num2);
        sc.close();
        System.out.println("Final values: num1 = " + num1 + ", num2 = " + num2);
    }
}
