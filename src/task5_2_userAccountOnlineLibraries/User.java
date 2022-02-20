package task5_2_userAccountOnlineLibraries;

public class User {
    // Класс "Пользователь" (User) с полями: интернет-почта, имя и фамилия (email, name, surname)
    public String email;
    public String name;
    public String surname;
    public Book book; //

    // конструктор
    public User(String email, String name, String surname, Book book) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.book = book;
    }

    //  какие книги читает пользователь
    // метод вывод на экран
    public String toString() {
        return "Пользователь:" + " Фамилия имя: " + surname + " "
                + name + " читает название книги: " + "<<" + book.title + ">> " + "автор книги: "
                + "[" + book.author.surname + " "
                + book.author.name + "]";
    }
}