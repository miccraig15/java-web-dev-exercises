package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the rectangle length?: ");
        int length = input.nextInt();
        System.out.println("What is the rectangle width?: ");
        int width = input.nextInt();
        int area = length*width;

        System.out.println("The area of the rectangle is " + area + ".");

    }
}
