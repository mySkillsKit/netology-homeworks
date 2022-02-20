package task12_1_ElevatorQueue;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Домашнее задание к занятию 4.2. Коллекции. Очередь.\n" +
                "Задача 1. Лифт\n");
        Scanner scanner = new Scanner(System.in);

        Queue<ElevatorFloor> floorQueue = new PriorityQueue<>();//очередь для вывода на экран

        Queue<ElevatorFloor> floorTimeMove = new PriorityQueue<>(); //очередь для расчета времени движения лифта


        //Ввод номеров этажей
        while (true) {

            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int floor = scanner.nextInt();

            if (floor < 0 || floor > 25) {
                System.out.println("Такого этажа нет в доме");

            } else {

                if (floor == 0) {

                    timeMoveElevator(floorTimeMove); //  метод расчета времени движения лифта

                    //выйти из цикла чтение данных из консоли
                    //Вывод информации о посещенных этажах
                    // в порядке добавления в формате: "этаж 1 -> этаж 22 -> этаж 0".
                    //пока очередь не пуста выводить этаж
                    System.out.println("Лифт проследовал по следующим этажам: ");
                    while (!floorQueue.isEmpty()) {
                        System.out.print(floorQueue.poll());
                    }
                    System.out.println(" --- этаж " + floor); // floor = 0
                    break;
                }

                System.out.println("Добавили этаж " + floor + " в очередь");
                addFloor(floorQueue, floor); // очередь для вывода на экран

                addFloor(floorTimeMove, floor); // очередь для расчета времени движения лифта
            }

        }
    }

    private static void addFloor(Queue<ElevatorFloor> floorQueue, int floor) {
        floorQueue.offer(new ElevatorFloor(floor));
    }

    // метод расчета времени движения лифта
    private static void timeMoveElevator(Queue<ElevatorFloor> floorTimeMove) {
        int waitDoorsInSeconds = 10; //- количество секунд, которое потребуется на закрытие/открытие дверей;
        int waitMoveInSeconds = 5; //- количество секунд, затрачиваемое лифтом на движение между этажами;
        int totalSeconds = 0; //- всего потрачено времени на движение и остановки лифтом;
        int previousFloor = -1; //- переменная для хранения предыдущей остановки.


        while (floorTimeMove.peek() != null) {

            int currentFloor = floorTimeMove.poll().getFloor();

            if (previousFloor != -1) {

                //--> этаж 2 --> этаж 8 --> этаж 20 --- этаж 0
                // (8-2)*5=30  30+10=40c  / 40+(20-8)*5 = 100  100+10= 110c=totalSeconds
                // вычисляем разницу между текущим этажем и предыдущим
                // и с помощью метода Math.abs найдем абсолютное значение (уберем знак)
                // и умножим на время движения:

                totalSeconds += Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
                //Добавим время открытия/закрытия дверей к totalSeconds:
                totalSeconds += waitDoorsInSeconds;
            }
            previousFloor = currentFloor;

        }

        System.out.println("Время затраченное лифтом на маршрут = " + totalSeconds + " с.");

    }

}




