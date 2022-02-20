package task7_1_turnTheMatrix;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int SIZE = 8; // задаем размер матрицы

    public static void main(String[] args) {
        System.out.println("Домашнее задание к занятию 2.2. Массивы многомерные\n" +
                "Задача 1. Поворот матрицы на 90 градусов по часовой стрелке");

        Scanner scanner = new Scanner(System.in);
        int[][] colors = new int[SIZE][SIZE]; //создадим матрицу и заполним Random
        int[][] rotatedColors = new int[SIZE][SIZE]; // массив для повернутой матрицы на 90
        int[][] rotatedColors2 = new int[SIZE][SIZE]; // массив для повернутой матрицы на 180
        int[][] rotatedColors3 = new int[SIZE][SIZE]; // массив для повернутой матрицы на 270

        Random random = new Random(); // заполним матрицу colors случайными
        // значениями в диапазоне от 0 до 255:
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // для случайных значений воспользуемся
                // готовым решением из библиотеки java.util.Random
                colors[i][j] = random.nextInt(256);
            }
        }

        printMatrix(colors); //метод вывода матрицы colors Random на экран

        while (true) {
            System.out.println("\n Введите угол поворота матрицы <90/180/270> градусов , или 'end' для завершения");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            int turn = Integer.parseInt(input);

            if (turn == 90) {
                System.out.println("\n " + "Вывод матрицы после поворота на 90 градусов");
                turnMatrix(rotatedColors, colors); //Метод Поворота матрицы на 90градусов
                printMatrix(rotatedColors); // Метод вывода на экран матрицы после поворота 90

            } else if (turn == 180) {
                System.out.println("\n " + "Вывод матрицы после поворота на 180 градусов");
                turnMatrix(rotatedColors, colors); //Метод Поворота матрицы colors на 90градусов
                turnMatrix(rotatedColors2, rotatedColors); //Метод Поворота матрицы rotatedColors на 90градусов
                printMatrix(rotatedColors2); // Метод вывода на экран матрицы после поворота 2*90 = 180

            } else if (turn == 270) {
                System.out.println("\n " + "Вывод матрицы после поворота на 270 градусов");
                turnMatrix(rotatedColors, colors); //Метод Поворота матрицы colors на 90градусов
                turnMatrix(rotatedColors2, rotatedColors); //Метод Поворота матрицы rotatedColors на 90градусов
                turnMatrix(rotatedColors3, rotatedColors2); //Метод Поворота матрицы rotatedColors2 на 90градусов
                printMatrix(rotatedColors3); // Метод вывода на экран матрицы после поворота 3*90 = 270

            } else {
                System.out.println("Неправильный угол поворота. Введите угол кратный 90 градусов: 90/180/270");
            }
        }
    }
    // метод поворота матрицы на 90 градусов
    public static void turnMatrix(int[][] rotatedColors, int[][] colors) {

        for (int i = 0; i < SIZE; i++) {
            int x = SIZE;
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][j] = colors[x - 1][i]; //Поворот матрицы на 90 градусов
                x = x - 1;
            }
        }
    }
    // метод вывода матрицы на экран
    public static void printMatrix(int[][] colors) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);   //Выводим матрицу после поворота на экран
            }
            System.out.println(); // Переход на следующую строку
        }
    }
}