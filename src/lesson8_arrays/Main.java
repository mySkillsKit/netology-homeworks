package lesson8_arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] temps = new int[31];
        boolean[] isFilled = new boolean[temps.length];

        while (true) {
            System.out.println("Введи день и температуру: day temp. Или end");
            String line = scanner.nextLine(); // "13 -5" или "end"
            if ("end".equals(line)) {
                break;
            }

            String[] parts = line.split(" "); // ["13", "-5"]
            int day = Integer.parseInt(parts[0]) - 1; // 13-1 = 12
            int temp = Integer.parseInt(parts[1]); // -5
            temps[day] = temp;
            isFilled[day] = true;

            double sum = 0;
            for (int t : temps) {
                sum += t;
            }
            int count = 0;
            for (boolean hit : isFilled) {
                if (hit) {
                    count++;
                }
            }
            System.out.println("Средняя: " + sum / count);
        }
        System.out.println("Программа завершена!");
    }
}