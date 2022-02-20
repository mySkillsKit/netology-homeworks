package task5_3_userToralOnline;

class Main {
    public static void main(String[] args) {
        System.out
                .println("Домашнее задание к занятию 3.1 Структура класса" + " \n Задача 3. Считаем онлайн-пользователей");

        System.out.println("\n *** Информация об онлайн-пользователях ***");

        User user = new User("downey@vk.com", "Robert", "Downey");
        System.out.println(user);

        User user1 = new User("brad@mail.ru", "Brad", "Pitt");
        System.out.println(user1);

        User user2 = new User("matt@gmail.com", "Matt", "Damon");
        System.out.println(user2);

        User user3 = new User("pacino@bk.ru", "Al", "Pacino");
        System.out.println(user3);

        User user4 = new User("leo@vk.com", "Leonardo", "Dicaprio");
        System.out.println(user4);

        // Выводим на консоль сколько в системе online user
        System.out.println(
                "\n ******* " + "\n Итого online пользователей в 'Онлайн-библиотеке': " + User.maxTotalOnline + " человек");
    }
}