package task5_2_userAccountOnlineLibraries;

public class Author {
    // Класс "Автор" (Author) c полями: имя, фамилия, год рождения, страна (name, surname, birthday, country)

    public String name;
    public String surname;
    public int birthday;
    public String country;

    public Author(String name, String surname, int birthday, String country) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.country = country;
    }

    // метод вывод на экран
    public String toString() {
        return "Имя и Фамилия автора: " + name + " " + surname;
    }
}