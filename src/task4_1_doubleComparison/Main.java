package task4_1_doubleComparison;

import java.util.Scanner;

class Main {



    private static void compareNumbers(double value1, float value2) {
        if (Math.abs(value1 - value2) < 0.000001) {
            System.out.println("Поздравляю, числа равны!");
        } else if (value1 > value2) {
            System.out.println("Числа НЕ равны!, Первое число больше Второго");
        } else {
            System.out.println("Числа НЕ равны!, Второе число больше Первого");
        }
    }

    public static void roundNumbers(double value1) {
        double value = Math.round(value1);
        System.out.println("Округление с помощью Math.round: " + value);
    }

    public static void cut(double value1) {
        long value3 = (long) value1;
        System.out.println("Отбросить дробную часть = " + value3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Операции над double/float");
        System.out.println("1. Сравнить");
        System.out.println("2. Округлить");
        System.out.println("3. Отбросить дробную часть");
        double value1;
        float value2 = 0.0f;

        while (true) {
            System.out.println("Введите номер операции, или 'end' для завершения");
            String input = scanner.next();
            if (input.equals("end")) {
                break;
            }
            int comparison = Integer.parseInt(input);

            if (comparison == 1) {
                System.out.println("Введите число double:");
                value1 = scanner.nextDouble();
                System.out.println("Введите второе число float:");
                value2 = scanner.nextFloat();
            } else {
                System.out.println("Введите число double:");
                value1 = scanner.nextDouble();
            }

            switch (comparison) {
                case 1:
                    // Код в этом блоке сработает, только если переменная comparison = 1;
                    // для сравнения — вычесть одно число из другого и проверить разницу с учётом
                    // погрешности; если они оказываются не равны, то указать какое из них больше;
                    System.out.println("Операция сравнения");
                    compareNumbers(value1, value2);
                    break;
                case 2:
                    // Код в этом блоке сработает, только если переменная comparison = 2;
                    // для округления — воспользуемся Math.round(value).
                    System.out.println("Операция округления");
                    roundNumbers(value1);
                    break;
                case 3:
                    // Код в этом блоке сработает, только если переменная comparison = 3;
                    // для отброса дробной части — можно привести к типу long;
                    System.out.println("Операция отбросить дробную часть");
                    cut(value1);
                    break;
                default:
                    // Код в этом блоке сработает, если ни одно условие выше не оказалось верным;
                    System.out.println("Неправильный номер. Введите номер: 1 или 2 или 3");
            }
        }
    }
}