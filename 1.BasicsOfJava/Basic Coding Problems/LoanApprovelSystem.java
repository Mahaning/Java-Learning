
import java.util.Scanner;

/** 
Scenario:
A bank approves loans only if the applicant’s credit score is above 700 and income is above ₹50,000.

Task:
Use logical && and relational > operators to check eligibility.

Operators Used: Logical (&&), Relational (>)
*/
public class LoanApprovelSystem {
    public static void main(String ...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your credit score:");
        int intCreditScore=sc.nextInt();
        System.out.println("Enter your monthly income:");
        double doubleMonthlyIncome=sc.nextDouble();
        if(intCreditScore>700 && doubleMonthlyIncome>50000){
            System.out.println("Congratulations! Your loan is approved.");
        }else{
            System.out.println("We're sorry, but your loan application has been denied.");
        }
    }
}
