package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){
        System.out.println("Welcome to a a game MadLibs\n");
        //1.Ask user for a season of the year
        System.out.println("Enter a season of the year."); //gets input;ask question
        Scanner scanner = new Scanner(System.in); //receive input to be able to use in calculations
        String seasonOfTheYear = scanner.next();//reads
        //2.Ask user for a whole number
        System.out.println("Enter a whole number.");
        int wholeNumber= scanner.nextInt();
        //3.Ask user for an adjective
        System.out.println("Enter an adjective.");
        String adjective = scanner.next();
        scanner.close();
        //4.Display results: "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee."
        System.out.println("On a "+ adjective + " " + seasonOfTheYear + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");
    }

}
