package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){

      // 1.Get numbers of hours worked. How? You must ask the user for this info using output
        System.out.println("Enter the number of hours the employee worked.");//this asks them to enter info
        Scanner scanner= new Scanner(System.in); //this receives info input so we can use it in our calculations
        int hours= scanner.nextInt(); //next method reads in the input; used integer bc the user is entering a # that is not a decimal
       // 2.GEt hourly pay rate
        System.out.println("Enter the hourly pay rate of the employee worked.");
        double rate = scanner.nextDouble();//using double because hourly pay rate may have a decimal
        scanner.close();
       // 3. Multiply hours and pay rate
            double grossPay = hours * rate;

       // 4.Display results
            System.out.println("The employee's gross pay is $" + grossPay);

    }
}
