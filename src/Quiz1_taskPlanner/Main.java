package Quiz1_taskPlanner;

import java.util.Scanner;

class Main {

    public static Scanner scanner = new Scanner(System.in);

    // Новый метод, с помощью которого будем просить пользователя что-нибудь ввести
    public static String ask(String message, String example) {

        // Вывод сообщения с просьбой что-то ввести
        System.out.println(message);

        // Показываем пример возможного ввода
        System.out.println("Например: " + example);

        // Выводим две угловые скобки перед курсором, чтобы
        // визуально выделить пользовательский ввод на экране;
        // Заметьте, что нет In в конце названия метода, это
        // чтобы не переносить курсор на новую строку после вывода
        System.out.print(">> ");

        // Считываем сканнером строку, что ввёл пользователь
        String input = scanner.nextLine();

        // Выводим пустую строку
        System.out.println();

        // Возвращаем введённую пользователем строку в качестве
        // результата работы нашей команды
        return input;
    }

    public static int extractTime(String task, String phrase) {
        int pos = task.indexOf(phrase);
        pos += phrase.length();
        String timeStr = task.substring(pos, pos + 2);
        timeStr = timeStr.trim();
        int time = Integer.parseInt(timeStr);
        return time;
    }

    public static void main(String[] args) {
        String name = ask("Имя", "Петя"); // переменная для хранения имени пользователя

        int totalTime = 0; // Переменные для хранения статистики: время на все задачи
        int totalFinishTime = 0; // время окончания последней задачи
        int maxTime = 0; // длительность самой большой задачи
        int tasksCount = 0; // количество заданий
        while (true) {
            // Попросим ввести задачу или попрощаться/ Вызов разнесём на несколько строк,
            // иначе не влезает
            String input = ask("Введите задачу на сегодня или 'end' для выхода",
                    "Буду программировать, начну с 11 и закончу в 17 часов");
            // Проверим, не захотел ли пользователь выйти
            // Если так, сломаем цикл и выйдем из цикла
            if (input.equals("end")) {
                break;
            }
            // Если не вышли из цикла по break, значит нам ввели новую задачу.
            // Положим её в другую переменную для наглядности
            String task = input;
            // Найдём время старта и окончания новой задачи
            int startTime = extractTime(task, "начну с ");
            int endTime = extractTime(task, "закончу в ");
            // и время, которое на неё затратит пользователь
            int spentTime = endTime - startTime;
            // Обновим наши переменные статистики
            totalTime += spentTime; // totalTime = totalTime + spendTime;
            // Math.max выбирает максимум из двух значений
            totalFinishTime = Math.max(totalFinishTime, endTime);
            maxTime = Math.max(maxTime, spentTime);
            // Увеличиваем счётчик тасков на 1
            tasksCount++;
        }
        // Если вышли из цикла, значит пользователь закончил
        // вводить задачи. Покажем ему статистику!
        System.out.println("Уважаемый, " + name + "! О ваших планах на сегодня: \n" + " Всего задач:  " + tasksCount + "\n"
                + " Последняя закончится в " + totalFinishTime + "\n" + " В среднем задача занимает "
                + (tasksCount != 0 ? ((totalTime * 60.0) / tasksCount) : 0) + " минут\n"
                + " Самая продолжительная задача на сегодня займёт " + totalTime + " часов\n" + " УДАЧИ НА СЕГОДНЯ!  :)");
    }
}

/*
 * Тут будет лежать введённый пользователем текст задания // Например,
 * "Буду программировать, начну с 11 и закончу в 17 часов" //String task =
 * scanner.nextLine(); // Фраза, по которой будем искать время начала String
 * startPhrase = "начну с ";
 *
 * // С помощью команд, которые умеет выполнять строка в Java // находим номер
 * символа, с которого начинается ключевая фраза
 *
 * int startPos = task.indexOf(startPhrase);
 *
 * // Цифры времени находятся чуть дальше - надо сдвинуться на // количество
 * символов в ключевой фразе startPos += startPhrase.length();
 *
 * // Теперь вырежем кусочек строки, начиная с этого места // и заканчивая уже
 * через два символа от места начала. // Для этого команде substring указываем
 * номера символов для // старта и для конца String startTimeStr =
 * task.substring(startPos, startPos + 2);
 *
 * // А вдруг время было утром и наш пользователь решил заняться // чем-то в 6
 * утра? Тогда вырезанная строка будет "6 " и из-за // этого пробела превращение
 * этой строки в число упадёт с ошибкой. // Хорошо, что у строк есть встроенная
 * команда удаления пробелов // со своих краёв - trim. startTimeStr =
 * startTimeStr.trim(); // Теперь просто превратим строку со временем старта в
 * числовой тип int startTime = Integer.parseInt(startTimeStr);
 *
 * // Поиск времени окончания по аналогии String endPhrase = "закончу в "; int
 * endPos = task.indexOf(endPhrase); endPos += endPhrase.length(); String
 * endTimeStr = task.substring(endPos, endPos + 2); endTimeStr.trim(); int
 * endTime = Integer.parseInt(endTimeStr);
 */
