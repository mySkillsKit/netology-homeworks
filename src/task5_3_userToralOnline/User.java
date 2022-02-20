package task5_3_userToralOnline;

public class User { // Класс "Пользователь" (User) с полями: интернет-почта, имя и фамилия (email, name, surname)
    public static int totalOnline = 0;
    public static int maxTotalOnline = 0;

    public String email;
    public String name;
    public String surname;

    // конструктор
    public User(String email, String name, String surname) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        totalOnline++;
        maxTotalOnline = Math.max(maxTotalOnline, totalOnline); // счетчик количества
    }

    // метод вывод на экран
    public String toString() {
        return "____________ " + "\n интернет-почта: " + email + "\n Имя пользователя: " + name + ", Фамилия: " + surname;
    }
}