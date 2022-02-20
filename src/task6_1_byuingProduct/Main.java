package task6_1_byuingProduct;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("2.1 Массивы одномерные. Задача 1. Покупка товаров");

        Scanner scanner = new Scanner(System.in);
        int productNumber = 0; //переменная для номера продукта
        int productCount = 0;  //переменная для количества
        int sumProducts = 0; //переменная которая хранить в себе итоговою сумму

        int[] totalPrices = new int[3]; //  создание массива общей стоимости
        int[] productCounts = new int[3];   // создание массива общее количество товара

        String[] products = {
                "Молоко",
                "Хлеб",
                "Гречневая крупа"
        }; // массив продуктов

        int[] prices = {
                50,
                14,
                80
        }; // массив цен

        System.out.println("Список возможных товаров для покупки:");
        // вывод на консоль
        for (int i = 0; i < products.length; i++) {
            productNumber = i + 1;
            System.out.println(productNumber + ". " + products[i] + " " + prices[i] + " руб/шт");
        }

        while (true) {     // цикл while ввода через консоль номер товара и количество
            System.out.println("Выберите номер товара и количество (например'3 10') или введите `end`");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            String[] parts = input.split(" ");  // расколоть строку на две переменные
            productNumber = Integer.parseInt(parts[0]);  // номер товара
            productCount = Integer.parseInt(parts[1]);   // количество товара
            int x = productNumber - 1; // номер ячейки массива общей стоимости и количества (totalPrices и productCounts)
            totalPrices[x] = totalPrices[x] + (productCount * prices[x]); // заполняем ячейки массива общая стоимость
            productCounts[x] = productCounts[x] + productCount;  // заполняем ячейки массива общее количество

            System.out.println(Arrays.toString(totalPrices));
            System.out.println(Arrays.toString(productCounts));
        }

        System.out.println("Ваша корзина:");  // выводим на консоль корзину товаров
        System.out.println("Наименование товара: Количество * Цена/за.ед = Общая стоимость");
        for (int i = 0; i < totalPrices.length; i++) {
            if (totalPrices[i] > 0) {
                System.out.println(products[i] + ":          " + productCounts[i] + " * " + prices[i] +
                        " = " + totalPrices[i] + " руб");
            }
        }
        // считаем Итоговую сумму всех значений массива "общая стоимость товара" totalPrices
        for (int i = 0; i < totalPrices.length; i++) {
            sumProducts = totalPrices[i] + sumProducts;
        }
        System.out.println("   Итого   " + sumProducts + " руб");  // выводим на консоль итоговую сумму
    }
}

//System.out.println(Arrays.toString(products));
//System.out.println(Arrays.toString(prices));// вывод на консоль

//        for (int i = 0; i < products.length; i++) {
//            if (products[i].length() == 4) {
//                System.out.println(products[i]);
//            }
//        }
//
//
//        for ( String product : products ) {
//           if (product.length() == 4) {
//               System.out.println(product);
//            }
//
//        }

//        String[] products2 = {
//                "Bread",
//                "Milk",
//                "Apples"
//        }; // массив продуктов2
//
//        System.out.println(Arrays.equals(products, products2));  // сравнения массивов
//        Arrays.sort(products2); // сортировка
//        System.out.println(Arrays.toString(products2)); // вывод на консоль
