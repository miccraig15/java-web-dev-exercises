package chaptertwo.exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?: ");
        float milesDriven = input.nextFloat();
        System.out.println("How many gallons of gas have been used?: ");
        float gallonsOfGas = input.nextFloat();
        float milesPerGallon = milesDriven / gallonsOfGas;

        System.out.println("Your MPG is " + milesPerGallon + ".");
    }
}