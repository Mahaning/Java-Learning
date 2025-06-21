
import java.util.Scanner;

/**
Scenario:
A financial app compares yesterday’s and today’s stock price to determine gain or loss.

Task:
Use relational and ternary operator to show result.

Operators Used: Relational (>, <), Ternary (?:)
 
 */
public class StockPriceComparator {
    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yesterday's stock price:");
        double yesterdayPrice = sc.nextDouble();
        System.out.println("Enter today's stock price:");
        double todayPrice = sc.nextDouble();
        if(yesterdayPrice <= 0 || todayPrice <= 0) {
            System.out.println("Stock prices must be greater than 0. Please enter valid prices.");
        } else {
            String result = (yesterdayPrice<todayPrice)?"todays stock price is higher than yesterday'\nStock difference: "+(todayPrice-yesterdayPrice):(yesterdayPrice>todayPrice)?"todays stock price is lower than yesterday'\nStock difference: "+(yesterdayPrice-todayPrice):"todays stock price is equal to yesterday's stock price\nStock difference: 0.0";
            System.out.printf("Result: %s%n", result);
        }
    }
}
