package task7_2_seaBattle;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 10; // определяем размерность массива = 10
    public static final int MAX_COUNT = 10; //Объявим переменную maxCount для хранения максимального числа кораблей = 10.

    //Для хранения состояния клетки создадим константы и дальше в коде будем использовать их:
    public static final int EMPTY = 0; // 0 - "пустое поле"
    public static final int SHIP = 1; // 1 - "есть корабль"
    public static final int DEAD = 2;  // 2 - "корабль застрелен"
    public static final int MISS = 3;  //3 - "промах"

    public static void main(String[] args) {
        System.out.println("Домашнее задание к занятию 2.2. Массивы многомерные\n" +
                "Задача 2. Морской бой"
                + "\n 0 - пустое поле"
                + "\n 1 - есть корабль"
                + "\n 2 - корабль застрелен"
                + "\n 3 - промах");

        int maxSpet = 30; // максимальное количество шагов = 30

        Scanner scanner = new Scanner(System.in);

        int[][] warField = new int[SIZE][SIZE]; // Создаем двумерный массив

        System.out.println("\n Заполнение кораблей...");
        // Разместим корабли в случайном порядке на поле (матрица warField):
        // для этого нужны случайные значения в диапазоне от 0 до 9 для координат ячеек.
        // Обозначим значения первой размерности shipPlace1, а второй размерности —shipPlace2.В таком случае у
        // нас случайные координаты ячеек для кораблей примут следующий вид:
        Random random = new Random();
        for (int i = 0; i < MAX_COUNT; i++) {
            int shipPlace1 = random.nextInt(SIZE);
            int shipPlace2 = random.nextInt(SIZE);

            if (warField[shipPlace1][shipPlace2] == SHIP) {
                // повторная генерация положения для данного корабля
                i--;
            }

            warField[shipPlace1][shipPlace2] = SHIP;
        }
        // выводим массив на экран
        // Цикл по первой размерности выводит строки
        printField(warField);


        while (true) {

            if (isWin(warField) == true) { // если остались в массиве SHIP = 1 то продолжаем

                if (0 < maxSpet) { // сколько осталось шагов
                    System.out.println("Введите координаты для атаки (например: 2 3) (осталось " + maxSpet + "):");
                    maxSpet--;  //  отнимает один шаг

                    String input = scanner.nextLine();
                    String[] parts = input.split(" "); // ["2", "3"]
                    int row = Integer.parseInt(parts[0]) - 1; // 2-1 = 1 значение ячейки row строка
                    int col = Integer.parseInt(parts[1]) - 1; // 3-1 = 2 значение ячейки column столбец

                    if (warField[row][col] == EMPTY) {  // если в ячейки = 0 "пустое поле"
                        warField[row][col] = MISS; // заносим в массив 3 - "промах"
                        System.out.println("промах!");
                        printField(warField); // печатаем матрицу

                    } else if (warField[row][col] == SHIP) { // если в ячейки = 1 "есть корабль"
                        warField[row][col] = DEAD; // заносим в массив 2 - "корабль застрелен"
                        System.out.println("корабль застрелен");
                        printField(warField); // печатаем матрицу

                    } else if (warField[row][col] == DEAD | warField[row][col] == MISS) {
                        // проверяем вводили ли уже эти координаты
                        System.out.println("Вы уже вводили эти координаты!");
                        maxSpet++;
                    }

                } else {
                    System.out.println("Превышен лимит максимального количества шагов");
                    break;
                }

            } else {
                System.out.println("Победа! Поздравляем, вы подбили все вражеские корабли!");
                break;
            }
        }

    }

    // метод поиска остались ли корабли 1 в массиве
    public static boolean isWin(int[][] warField) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (warField[i][j] == SHIP) {
                    return true;
                }
            }
        }
        return false;
    }

    // метод печати массива
    public static void printField(int[][] warField) {
        for (int i = 0; i < SIZE; i++) {
            // Цикл по второй размерности выводит колонки - вывод одной строки
            for (int j = 0; j < SIZE; j++) {
                // Используем оператор print - без перехода на следующую строку
                System.out.print(warField[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

}
