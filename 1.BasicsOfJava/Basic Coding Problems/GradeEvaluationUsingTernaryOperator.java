
/**
 * Problem: Accept a student's percentage and use the ternary operator to assign a grade:

>= 90: A

>= 75: B

>= 50: C

< 50: F
 */

import java.util.Scanner;

public class GradeEvaluationUsingTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        String grade = (marks >= 90) ? "A" : (marks >= 80) ? "B" : (marks >= 70) ? "C" : "D";
        System.out.println("Your grade is: " + grade);
        sc.close();
    }
}
