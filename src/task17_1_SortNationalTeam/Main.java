package task17_1_SortNationalTeam;

import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание к занятию 3. Сортировки" +
                "\n Задача о национальной команде");

     /*
    int[][] regionalTeams = {
         {45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
         {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
         {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}
     
     };
     */

        //объявляем и создаём массив, указывая только количество строк
        int[][] regionalTeams = new int[3][];
        //инициализируем массив, заполняя его массивами разной длины
        regionalTeams[0] = new int[]{45, 31, 24, 22, 20, 17, 14, 13, 12, 10};
        regionalTeams[1] = new int[]{31, 18, 15, 12, 10, 8, 6, 4, 2, 1};
        regionalTeams[2] = new int[]{51, 30, 10, 9, 8, 7, 6, 5, 2, 1};
        //regionalTeams[3] = new int[]{61, 34, 20, 19, 8, 8, 7, 5, 3, 1};

        int length = regionalTeams[0].length;
        int lines = regionalTeams.length;

        int[] nationalTeam = new int[length];

       // System.out.println(Arrays.deepToString(regionalTeams));
        bubbleSort(regionalTeams, length);

        //вывод на экран массива
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(regionalTeams[i][j] + " ");
            }
            System.out.println("  Команда № " + (i+1));
        }

        /*
        for (int j = 0; j < length; j++) {
            System.out.print(regionalTeams[0][j] + " ");
        }
        */

        System.out.println();

        //сортировка слиянием
        merge(regionalTeams[0], regionalTeams[1], nationalTeam);
        //System.out.println(Arrays.toString(nationalTeam));

        int j = 2;
        while (j < lines) {
            int[] arrayA = nationalTeam.clone();
            merge(arrayA, regionalTeams[j], nationalTeam);
            j += 1;
        }

        System.out.println("Национальная команда из массива региональных команд");
        System.out.println(Arrays.toString(nationalTeam));
    }

    private static void bubbleSort(int[][] regionalTeams, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (regionalTeams[0][j] > regionalTeams[0][i]) {
                    int tmp = regionalTeams[0][j];
                    regionalTeams[0][j] = regionalTeams[0][i];
                    regionalTeams[0][i] = tmp;
                }
            }
        }
        System.out.println();
    }

    private static void merge(int[] arrayA, int[] arrayB, int[] nationalTeam) {

        int ia = 0; //счетчик в массиве arrayA
        int ib = 0; //счетчик в массиве arrayB
        int ic = 0; // счетчик в массиве nationalTeam

        while (ia < arrayA.length || ib < arrayB.length) {

            if (ia == arrayA.length) {
                nationalTeam[ic] = arrayB[ib];
                ib += 1;
            } else if (ib == arrayB.length) {
                nationalTeam[ic] = arrayA[ia];
                ia += 1;
            } else {
                if (arrayA[ia] >= arrayB[ib]) {
                    nationalTeam[ic] = arrayA[ia];
                    ia += 1;
                } else {
                    nationalTeam[ic] = arrayB[ib];
                    ib += 1;
                }
                ic += 1;
                if (ic == nationalTeam.length) {
                    break;
                }
            }
        }

    }

}

/* Задача о национальной команде
В стране есть n региональных команд, каждая состоит из 10 игроков, у каждого игрока есть рейтинг. Вам надо написать программу, которая из всех региональных команд соберёт команду национальную - топ-10 игроков по рейтингу. Каждая команда задаётся в виде массива с рейтингами игроков в порядке убывания. Ваша программа должна вывести такой же массив для национальной команды. Целевая асимптотика: O(n) времени, константная память.

Решение
Давайте воспользуемся алгоритмом слияния. Если мы сольём два массива команд, то получим массив команды из 20 человек, упорядоченный по убыванию. Нам нужно только 10 человек, так что модифицируем алгоритм слияния таким образом, что будем прерывать его как только в итоговом массиве набралось 10 человек (это всегда будут топ-10 человек из двух массивов).

Возьмём первую региональную команду и сольём её так со второй. Так мы получим топ-10 человек из обеих команд. Давайте полученную команду сольём с третьей - так мы получим топ-10 человек из трёх команд. Проделаем так со всеми региональными командами, в итоге получив топ-10 человек из всех региональных команд.

national_team(regional_teams):
  team = regional_teams[0]
  for i от 1 до длина(regional_teams)
    team = merge(team, regional_teams[i])
  return team
Операцию merge реализуйте сами, модифицировав алгоритм с лекции так, чтобы слияние прекращалось после первых 10 элементов.

Оценим асимптотику: каждый раз мы сливаем команды длинною 10, т.е. время работы слияния двух команд не зависит от количества регионов, а стало быть это константная для n операция как для времени, так и для памяти. Таких операций мы сделаем n-1 раз, пройдясь по всем регионам. Итого: асимптотика O(n).

Реализация
Создайте массив региональных команд, в котором будут храниться команды: [45, 31, 24, 22, 20, 17, 14, 13, 12, 10], [31, 18, 15, 12, 10, 8, 6, 4, 2, 1], [51, 30, 10, 9, 8, 7, 6, 5, 2, 1].
Напишите метод слияния команд для выбора топ-10 из обеих команд.
Напишите метод для выбора национальной команды из массива региональных команд.
Запустите метод выбора национальной команды на примере и выведите на экран, убедитесь, что она совпадает с: [51, 45, 31, 31, 30, 24, 22, 20, 18, 17].
Загрузите ваше решение на сайт repl.it, отправьте ссылку на него на проверку.
*/
