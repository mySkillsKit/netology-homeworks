package task3_2_convertTime;

import java.util.Scanner;

class Main {

    public static int convertToSeconds(int days, int hours, int minutes) { // перевод дней, часов и минут в секунды.
        int seconds;
        seconds = days * 24 * 3600 + hours * 3600 + minutes * 60;
        return seconds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTime = 0; //для хранения общего времени на все задачи (изначально равно 0)
        int biggestTime = 0; // для хранения времени самой продолжительной задачи (изначально равно 0).
        // Для первой задачи ее время выполнения всегда будет больше, чем biggestTime
        int smallestTime = Integer.MAX_VALUE; // для хранения времени самой короткой задачи,
        // изначально равно максимальному значению integer(2147483647),
        // так как мы еще не нашли самую короткую задачу.
        // Для первой задачи ее время выполнение всегда будет меньше, чем изначальное значение smallestTime.

        while (true) {
            System.out.println("--------------------------");
            System.out.println("Введите название задачи");
            String nameTask = scanner.nextLine();
            System.out.println("Сколько дней потребуется на выполнение?");
            int days = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько часов?");
            int hours = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько минут?");
            int minutes = Integer.parseInt(scanner.nextLine());

            int currentTimeTask = convertToSeconds(days, hours, minutes);
            totalTime += currentTimeTask; // или totalTime = totalTime + currentTimeTask;

            biggestTime = (currentTimeTask > biggestTime) ? currentTimeTask : biggestTime;
            //Тернарный оператор!  Если значение currentTimeTask больше значения biggestTime,
            // то присвоить значение currentTimeTask к biggestTime.
            smallestTime = (currentTimeTask < smallestTime) ? currentTimeTask : smallestTime;
            //Тернарный оператор! Если значение currentTimeTask меньше значения smallestTime,
            // то присвоить значение currentTimeTask к smallestTime.

            System.out.println("Для завершения работы программы введите `end` / для продолжения нажмите enter");
            String end = scanner.nextLine(); //что ввел пользователь
            if (end.equals("end")) {
                break;
            }
        }
        System.out.println("*************************");
        System.out.println("Всего потребуется: " + totalTime + " секунд");
        System.out.println("Самая продолжительная задача займет: " + biggestTime + " секунд");
        System.out.println("Самая короткая задача займет " + smallestTime + " секунд");

    }
}