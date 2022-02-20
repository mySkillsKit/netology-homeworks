package task2_1_adder;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Программа расчета суммы трех чисел");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int value1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int value2 = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int value3 = scanner.nextInt();
        int result = sum(value1, value2, value3);
        System.out.println("Сумма чисел = " + result);
    }

    public static int sum(int value1, int value2, int value3) {
        int result = value1 + value2 + value3;
        return result;
    }
}