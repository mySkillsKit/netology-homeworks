package task3_1_leapYear;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в формате *yyyy*");
        int yaer = scanner.nextInt();

        if (yaer % 400 == 0) {  // Специальный оператор % - возвращает остаток от деления. Результат         вычисления будет равен 0, только если число делится нацело, иначе вернется остаток от деления
            System.out.println("Количество дней 366");
        } else if (yaer % 100 == 0) {
            System.out.println("Количество дней 365");
        } else if (yaer % 4 == 0) {
            System.out.println("Количество дней 366");
        } else {
            System.out.println("Количество дней 365");
        }
    }
}