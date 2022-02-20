package task10_1_CheckAccessExceptionAndStacktrace;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static User[] getUsers() {

        User user1 = new User("sam", "sam@gmail.com", "abc", 30);
        User user2 = new User("andy", "andy@gmail.com", "123", 16);
        User user3 = new User("mark", "mark@gmail.com", "mark", 12);
        User user4 = new User("john", "jhon@gmail.com", "pass", 24);

        return new User[]{user1, user2, user3, user4};

    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        System.out.println("Задача 1. Проверка доступа к ресурсу\n" +
                " <Исключения и stacktrace>");

        System.out.println(Arrays.toString(getUsers()));

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scan.nextLine();
        System.out.println("Введите пароль");
        String password = scan.nextLine();

        //Проверить логин и пароль
        User user = getUserByLoginAndPassword(login, password);

        //Вызвать методы валидации пользователя
        validateUser(user);

        System.out.println("Доступ предоставлен");

    }


    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {

            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        //Если возраст менее 18 лет, метод должен выбросить исключение AccessDeniedException

            if (user.getAge() < 18) {
                throw new AccessDeniedException("Age less than 18 years");
            }
    }

}

