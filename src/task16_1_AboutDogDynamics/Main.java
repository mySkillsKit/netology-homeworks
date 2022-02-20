package task16_1_AboutDogDynamics;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int SIZE = 10; // определяем размерность массива = 10
    public static final char EMPTY = '-'; // пустое поле
    public static final char PUPPY = 'Щ'; //поле Щ - щенок
    public static final char HUMAN = 'Ч'; //поле Ч - человек
    public static final char CACTUS = '*'; //поле * - кактус
    public static final char PATH = 'x'; //поле x - путь щенка
    public static final int MAX_COUNT = 20; // переменная для хранения максимального числа кактусов.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Домашнее задание к занятию 2. Динамическое программирование\n " +
                "Задача о щенке\n");

        char[][] field = new char[SIZE][SIZE]; // Создаем двумерный массив
        arrayFill(field, EMPTY); //заполняем массив '-'

        char[][] memory = new char[SIZE][SIZE]; // Создаем двумерный массив
        // для памяти динамического программирования
        arrayFill(memory, '?'); //заполняем массив '?'
        
        System.out.println("Расположим кактусы в случайном порядке..");
        // Расположим кактусы в случайном порядке на поле (матрица field):
        // для этого нужны случайные значения в диапазоне от 0 до 20 для координат ячеек.

        Random random = new Random();
        for (int i = 0; i < MAX_COUNT; i++) {
            int place1 = random.nextInt(SIZE);
            int place2 = random.nextInt(SIZE);
            if (field[place1][place2] == CACTUS) {
                i--;
            }
            field[place1][place2] = CACTUS;
        }

        field[0][0] = PUPPY; // В левом верхнем углу находится щенок.

        // печатаем поле с кактусами
        printField(field);
        System.out.println();

        System.out.println("Введите координаты человека (Например: 3 8)");
        String[] input = scan.nextLine().split(" ");
        int x0 = Integer.parseInt(input[0]);
        int y0 = Integer.parseInt(input[1]);

        //поиск пути щенка
        findPath(field, x0, y0, memory);

        /*System.out.println();
        printField(memory);*/

    }

    private static void findPath(char[][] field, int x0, int y0, char[][] memory) {
        char[][] path = new char[SIZE][SIZE];
        int x = x0;
        int y = y0;

        while (x != 0 || y != 0) {
            char direction = whereFrom(field, x, y, memory);

            if (direction == 'N') {
                System.out.println("Нет такого пути :(");
                break;
            } else if (direction == 'U') {
                path[x][y] = 'Y';  //      path[x][y] = "да"
                y -= 1;
            } else if (direction == 'L') {
                path[x][y] = 'Y';  //      path[x][y] = "да"
                x -= 1;
            }
        }

        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                if (i == x0 && j == y0) {
                    path[i][j] = HUMAN;
                } else if (path[i][j] == 'Y') {
                    path[i][j] = PATH;
                } else {
                    path[i][j] = field[i][j];
                }
            }
        }
        System.out.println("\n Результат работы программы (x - маршрут щенка):");
        printField(path);
    }

    private static void arrayFill(char[][] field, char symbol) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = symbol;
            }
        }
    }

    private static char whereFrom(char[][] field, int x, int y, char[][] memory) {
        if (memory[x][y] != '?') {
            return memory[x][y];
        }
        if (y > 0) {
            int upX = x;
            int upY = y - 1;

            if (upX == 0 && upY == 0) {
                memory[x][y] = 'U';
                return 'U';
            }

            if (field[upX][upY] != CACTUS) {
                if (whereFrom(field, upX, upY, memory) != 'N') {
                    memory[x][y] = 'U';
                    return 'U';
                }
            }
        }

        if (x > 0) {
            int leftX = x - 1;
            int leftY = y;

            if (leftX == 0 && leftY == 0) {
                memory[x][y] = 'L';
                return 'L';
            }

            if (field[leftX][leftY] != CACTUS) {
                if (whereFrom(field, leftX, leftY, memory) != 'N') {
                    memory[x][y] = 'L';
                    return 'L';
                }
            }
        }
        memory[x][y] = 'N';
        return 'N';
    }

    // метод печати массива
    private static void printField(char[][] field) {
        for (int i = 0; i < SIZE; i++) {
            // Цикл по второй размерности выводит колонки - вывод одной строки
            for (int j = 0; j < SIZE; j++) {
                // Используем оператор print - без перехода на следующую строку
                System.out.print(field[i][j] + "  ");
            }
            // Переход на следующую строку
            System.out.println();
        }
    }
}

/*field[0][3] = CACTUS;
        field[0][4] = CACTUS;
        field[1][4] = CACTUS;
        field[1][6] = CACTUS;
        field[1][7] = CACTUS;
        field[2][3] = CACTUS;
        field[2][5] = CACTUS;
        field[2][9] = CACTUS;
        field[3][1] = CACTUS;
        field[4][6] = CACTUS;
        field[5][2] = CACTUS;
        field[5][5] = CACTUS;
        field[6][3] = CACTUS;
        field[6][6] = CACTUS;
        field[6][7] = CACTUS;
        field[6][8] = CACTUS;
        field[7][7] = CACTUS;
        field[8][7] = CACTUS;
        field[9][5] = CACTUS;
        field[9][6] = CACTUS;*/