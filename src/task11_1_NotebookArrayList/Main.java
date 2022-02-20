package task11_1_NotebookArrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к занятию 4.1 Коллекции List\n" +
                "Задача 1. Записная книга");

        Scanner scanner = new Scanner(System.in);

        List<String> notebook = new ArrayList<>(10);

        while (true) {

            System.out.println(
                    "\n Выберите действие:\n" +
                            "1. Добавить задачу\n" +
                            "2. Вывести список задач\n" +
                            "3. Удалить задачу\n" +
                            "0. Выход");
            int number = 2;

            try {
                number = scanner.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("Неправильный номер. Введите номер: 1 / 2 / 3 / 0");
            }

            if (number == 0) {
                //0. Выход
                break;
            }
            scanner.nextLine();

            switch (number) {
                case 1://Добавить задачу

                    while (true) {
                        System.out.println("Введите название задачи (для завершения введите end)");
                        String task = scanner.nextLine();

                        if (task.equals("end")) {
                            printList(notebook);
                            break;
                        }
                        // Если не введено слово end, то сохранить
                        // введенное значение в переменную task
                        // и добавить его в список list
                        notebook.add(task);
                    }
                    break;

                case 2: //Вывести список задач
                    printList(notebook);
                    break;

                case 3: //удалить из списка определенное дело по индексу
                    while (true) {
                        System.out.println("Для удаления задачи из списка введите номер задачи " +
                                "(для завершения введите\"Finish\") ");
                        String input = scanner.nextLine();
                        if (input.equals("Finish")) {
                            printList(notebook);
                            break;
                        }

                        int taskNumber;
                        try {
                            taskNumber = Integer.parseInt(input) - 1;
                            notebook.remove(taskNumber);
                            System.out.println("Задача под номером " + input + " удалена!\n");
                        } catch (NumberFormatException err) {
                            System.out.println("Введенные данные не корректны! Допустим ввод только чисел");
                        } catch (IndexOutOfBoundsException err) {
                            System.out.println(" Задачи под номером " + input + " не существует! " +
                                    "Введите корректный номер задачи!");
                        }
                    }
                    break;

                default:
                    // Код в этом блоке сработает, если ни одно условие выше не оказалось верным;
                    System.out.println("Неправильный номер. Введите номер: 1 / 2 / 3 / 0");

            }

        }

    }

    //вывод списка дел в консоль
    private static void printList(List<String> notebook) {
        System.out.println("Список задач:");
        for (int i = 0; i < notebook.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, notebook.get(i));
        }

    }

}
