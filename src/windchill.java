import java.util.Scanner;

/*
 * This program calculates wind chill based off wind speed and temperature.
 * Michael Jarman
 * January 30th, 2020
 */

public class windchill {
    public static void main (String[] args) {
        // Constants
        final double CONSTANT_1 = 35.74;
        final double CONSTANT_2 = 0.6215;
        final double CONSTANT_3 = 35.75;
        final double CONSTANT_4 = 0.16;
        final double CONSTANT_5 = 0.4275;

        // Variables
        double outsideTemp;
        double windSpeed;
        double windChill;

        // New scanner object
        Scanner userInput = new Scanner(System.in);

        // Print introduction
        System.out.println("Wind Chill Calculator");
        System.out.println("");

        // Ask user for temperature
        System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
        outsideTemp = userInput.nextDouble();

        // Ask user for wind speed
        System.out.print("Enter the wind speed (must be >=5 and <= 60): ");
        windSpeed = userInput.nextDouble();

        // Calculate Wind Chill
        double windChill1 = CONSTANT_2 * outsideTemp;
        double windChill2 = CONSTANT_3 * Math.pow(windSpeed, CONSTANT_4);
        double windChill3 = CONSTANT_5 * outsideTemp * Math.pow(windSpeed, CONSTANT_4);
        windChill = CONSTANT_1 + windChill1 - windChill2 + windChill3;

        // Print Wind Chill
        System.out.println();
        System.out.println("Wind Chill Temperature: " + windChill + " degrees Fahrenheit");

        // Print programmer name
        System.out.println();
        System.out.println("Programmer: Michael Jarman");

        // Close scanner
        userInput.close();
    }
}
