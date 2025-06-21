
/**
 * Problem: Write a program to implement a simple calculator using +, -, *, /, and % so on..... operators.
 * Input: Two double and an oprations.
 */
import java.util.Scanner;

public class SimpleCalculator {
    // Class implementation goes here
    public static void main(String[] args) {
        // Example usage of the SimpleCalculator class
        double num1, num2, result;
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select operation: 1. Addition 2. Subtraction 3. Multiplication 4. Division 5.Power 6.Square 7.Square Root 8.Cube Root 9. Exit");
        int intChoice=sc.nextInt();  
        result = 0;
        
        switch(intChoice){
            case 1:
            System.out.println("Enter first number:");
        num1 = sc.nextDouble();  
        System.out.println("Enter second number:");
        num2 = sc.nextDouble();  
                result=num1+num2;
                System.out.println("Fisrst Number:"+num1);
                System.out.println("Second Number:"+num2);
                System.out.println("Result:"+result);
                break;
            case 2:
            System.out.println("Enter first number:");
        num1 = sc.nextDouble();  
        System.out.println("Enter second number:");
        num2 = sc.nextDouble();  
                result=num1-num2;
                System.out.println("Fisrst Number:"+num1);
                System.out.println("Second Number:"+num2);
                System.out.println("Result:"+result);
                break;
            case 3:
            System.out.println("Enter first number:");
        num1 = sc.nextDouble();  
        System.out.println("Enter second number:");
        num2 = sc.nextDouble();  
                result=num1*num2;
                System.out.println("Fisrst Number:"+num1);
                System.out.println("Second Number:"+num2);
                System.out.println("Result:"+result);
                break;
            case 4:
            System.out.println("Enter first number:");
        num1 = sc.nextDouble();  
        System.out.println("Enter second number:");
        num2 = sc.nextDouble();  
                if(num2!=0){
                    result=num1/num2;
                    System.out.println("Fisrst Number:"+num1);
                    System.out.println("Second Number:"+num2);
                    System.out.println("Result:"+result);
               
                }else{
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
            System.out.println("Enter first number:");
        num1 = sc.nextDouble();  
        System.out.println("Enter second number:");
        num2 = sc.nextDouble();  
                result=Math.pow(num1,num2);
                System.out.println("Fisrst Number:"+num1);
                System.out.println("Second Number:"+num2);
                System.out.println("Result:"+result);
                break;

            case 6:
            System.out.println("Enter first number:");
        num1 = sc.nextDouble();  
                result=Math.pow(num1,2);
                System.out.println("Fisrst Number:"+num1);
                System.out.println("Result:"+result);
                break;
            case 7:
            System.out.println("Enter first number:");
        num1 = sc.nextDouble();   
                result=Math.sqrt(num1);
                System.out.println("Fisrst Number:"+num1);
                System.out.println("Result:"+result);
                break;
            case 8:
            System.out.println("Enter first number:");
        num1 = sc.nextDouble();  
                result=Math.cbrt(num1);
                System.out.println("Fisrst Number:"+num1);
                System.out.println("Result:"+result);
                break;
        case 9: 
                System.out.println("Exiting the calculator. Thank you for using it!");
                sc.close();
                System.exit(0); // Exit the program
            default:
                System.out.println("Invalid operation selected. Please choose a valid option.");
        }
   }
}
}