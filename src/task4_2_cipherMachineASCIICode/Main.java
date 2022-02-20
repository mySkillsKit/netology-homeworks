package task_4_2_Cipher_machine_ASCII_code;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Создаем scanner - объект, который будет считывать из стандартного потока ввода/вывода (console)
        System.out.println("Задача 2. Шифровальная машинка");
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String output = "";
        //Цикл будет работать, пока пользователь не введет `end`
        while (true) {
            System.out.println("--------------------------");
            System.out.println("Введите ASCII код (end для вывода результата):");
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            int x = Integer.parseInt(input,8);
            //System.out.println(x);
            char c = (char)x;
            output = output + c;
        }
        System.out.println("*************************");
        System.out.println("Результат: " + output);
    }
}