
import java.util.Scanner;

public class CheckIfaNumberIsPowerof2UsingBitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n>0){
            if((n&(n-1))==0){
                System.out.println("The number is a power of 2.");
            }else{
                System.out.println("The number is not a power of 2.");
            }
        }else{
            System.out.println("The number is not a power of 2.");
        }
    }
}
