package Lesson13_exceptionAndStacktrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Input your age");
        int age;
        try {
            age = getNumberFromConsole();
        } catch (InputMismatchException err) {
            scan.nextLine();
        }

        System.out.println("Input your height in sm");
        int height;
        try {
            height = getNumberFromConsole();
        } catch (InputMismatchException err) {
            System.out.println(" Error Error  Error Error !!!!");
            scan.nextLine();
            return;
        }


        System.out.println("Input your weight");
        int weight;
        try {
            weight = getNumberFromConsole();
        } catch (InputMismatchException err) {
            System.out.println(" Error Error  Error Error !!!!");
            scan.nextLine();
            throw new RuntimeException(" Error Error  Error Error !!!! RuntimeException ");
        }

        double bmi = calculateBmi(weight, height);
        System.out.printf(" Your BMI: %.2f\n", bmi);

    }

    private static int getNumberFromConsole() throws InputMismatchException {
            return scan.nextInt();

    }

    private static double calculateBmi(int weight, int height) {
        return 10_000 * weight / Math.pow(height, 2);
    }

}
