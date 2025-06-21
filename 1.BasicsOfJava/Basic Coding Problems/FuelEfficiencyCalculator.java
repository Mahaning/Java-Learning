
import java.util.Scanner;

/**
Scenario:
A car rental company wants to calculate fuel efficiency to help customers understand their fuel consumption.

Task:
Write a Java program to take distance traveled (in km) and fuel consumed (in liters) and calculate km per liter using / operator.

Operators Used: Arithmetic (/)
 */
public class FuelEfficiencyCalculator {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distance traveled (in km):");
        double distance=sc.nextDouble();
        System.out.println("Enter fuel consumed (in liters):");
        double fuel=sc.nextDouble();
        if(distance<=0){
            System.out.println("Distance must be greater then 0, please enter a valid distance.");
        }else if(fuel<=0){
            System.out.println("Fuel consumed must be greater then 0, please enter a valid fuel consumption.");
        }else{
            double FuelEfficiency= distance/fuel;
            System.out.printf("Fuel efficiency is %.2f km/liter%n", FuelEfficiency);
        }
    }
}
