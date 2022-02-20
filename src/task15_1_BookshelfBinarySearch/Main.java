package task15_1_BookshelfBinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к занятию 1. Введение в алгоритмы и структуры данных\n" +
                "Задача 2. Книжная полка\n");
        Scanner scan = new Scanner(System.in);

       // int[] arr = new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72}; //массив размеров текущих книг
       // int bookSize = 32; //размер новой книги

        System.out.println("Введите размер текущих книг/ Например 14, 16, 19, 32, 32, 32, 56, 69, 72 ");
        String[] input = scan.nextLine().split(", ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.println("Введите размер новой книги bookSize = ");
        int bookSize = scan.nextInt();


        System.out.println("Вывод размеров текущих книг на экран " + Arrays.toString(arr)); // вывод на экран
        System.out.println("Длинна массива = " + arr.length); //длинна массива
        System.out.println("Размер новой книги bookSize = " + bookSize);


        //Задаём границы интервала бинарного поиска
        int left = 0;
        int right = arr.length - 1;

        while (left < right) { //Задаём цикл: пока в интервале больше одного элемента

            System.out.println("_______________________");
            System.out.println("left = " + left + " / right = " + right);

            long middle = (long) (left + right) / 2; // (long) Отбросить дробную часть.Смотрим в середину
            System.out.println("middle = (i) = (left + right)/2 = " + middle);
            int i = (int) middle; //индекс элемента

            System.out.println("arr[i] = " + arr[i] + " ><= ?? " + " bookSize = " + bookSize);

            if (arr[i] == bookSize) {
                //нашли - но продолжаем поиск
                System.out.println("1. if (arr[i] == bookSize) - Yes");
                left = i + 1; // ищем справа
            } else if (arr[i] > bookSize) {
                System.out.println("2. else if (arr[i] > bookSize) - Yes");
                right = i - 1; // ищем слева

            } else if (arr[i] < bookSize) {
                System.out.println("3. else  if (arr[i] < bookSize) - Yes");
                left = i + 1; // ищем справа
            }
            if (arr[left] == bookSize) {
                //нашли!
                System.out.println("4. if (arr[left] == bookSize) - Yes");
            }
            System.out.println("left = " + left + " / right = " + right);
        }

        if (left == right) {
            if (arr[left] > bookSize) {
                calcQuantityBigBooks(left, bookSize, arr);
            } else {
                left = left + 1;
                calcQuantityBigBooks(left, bookSize, arr);
            }
        } else {
            calcQuantityBigBooks(left, bookSize, arr);
        }

    }

    //считаем кол-во книг больше размера новой книги и выводим на экран
    private static void calcQuantityBigBooks(int left, int bookSize, int[] arr) {

        int quantityBigBooks = 0; // кол-во книг больше размера новой книги
        quantityBigBooks = arr.length - left;
        System.out.println("На полке " + quantityBigBooks + " книг(-a/-и) больше чем "
                + bookSize + " страницы");

    }

}

/*
Задача 2. Книжная полка
У вас есть книжная полка, у каждой книги есть размер - количество страниц.
 Книжная полка представлена массивом, в котором хранятся размеры книг в порядке возрастания.
 Вам надо написать функцию, которая принимала бы этот массив размеров текущих книг,
 размер новой книги и вычисляла бы количество больших по размеру книг уже на полке.
 Требуемая алгоритмическая сложность: время O(log2n), дополнительная память O(1).

Подумайте, как вы решили бы эту задачу, как достигли бы требуемой асимптотики.

Решение
Реализуйте алгоритм бинарного поиска. С его помощью вы найдёте место в массиве,
 где слева от него будут элементы меньше или равны, а справа строго больше.
 Работает бинарный поиск как раз за время O(log2n), дополнительную память O(1).

Обратите внимание на случай когда у нас на полке есть несколько книг с тем же размером,
что и у новой книги. Именно поэтому мы не останавливаем бинарный поиск когда найдём какой-то
 из таких размеров в массиве, ведь для ответа нам важно чтобы справа от найденной позиции
 были книги только строго большие по размеру. Продолжать поиск нужно именно бинарным поиском,
  нельзя просто взять и пройтись вправо по равным элементам до тех пор пока не встретим больший,
  ведь тогда асимптотика упадёт с O(log2n) до O(n).

Процесс реализации
В начале работы программы заведите массив со значениями: [14, 16, 19, 32, 32, 32, 56, 69, 72].
Напишите функцию, которая бы принимала массив, размер новой книги
и возвращала бы количество больших по размеру книг по рассмотренному выше алгоритму.
Внимание! Вызывать готовые реализации бинарного поиска запрещено.
Вызовите эту функцию, передав туда массив и размер новой книги - 32.
Выведите результат на экран. Убедитесь, что ответ верный: 3
(т.к. только три книги на полке строго больше чем 32 страницы).
Вызовите эту функцию, передав туда массив и размер новой книги - 60.
Выведите результат на экран. Убедитесь, что ответ верный: 2
 (т.к. только две книги на полке строго больше чем 60 страницы).

 */

/*
бинарный поиск
int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            System.out.println("_______________________");
            System.out.println("left = " + left + " / right = " + right);

            long middle = (long) (left + right) / 2; // (long) Отбросить дробную часть
            System.out.println("middle = (i) = (left + right)/2 = " + middle);
            int i = (int) middle; //индекс элемента

            System.out.println("arr[i] = " + arr[i] + " ><= ?? " + " bookSize = "+ bookSize);

            if (arr[i] == bookSize) {
                System.out.println("if (arr[i] == bookSize) - Yes");
                System.out.println("bookSize = " + bookSize);

                calcQuantityBigBooks(i, bookSize, arr);
                break;
            } else if (arr[i] > bookSize){
                System.out.println("else if (arr[i] > bookSize) - Yes");

                right = i - 1; // ищем слева
            } else  if (arr[i] < bookSize) {
                System.out.println("else  if (arr[i] < bookSize) - Yes");
                left = i + 1; // ищем справа
            }
            if (arr[left] == bookSize) {
                System.out.println("if (arr[left] == bookSize) - Yes");
                System.out.println("bookSize = " + bookSize);

                calcQuantityBigBooks(left, bookSize, arr);
                break;
            }
            System.out.println("left = " + left + " / right = " + right);
        }

    }

    private static void calcQuantityBigBooks(int i, int bookSize, int[] arr) {
        int quantityBigBooks = 0; // кол-во книг больше размера новой книги
        quantityBigBooks = arr.length - 1  - i ;
        System.out.println("На полке "+ quantityBigBooks + " книг(и) больше чем " + bookSize + " страницы");
    }
 */