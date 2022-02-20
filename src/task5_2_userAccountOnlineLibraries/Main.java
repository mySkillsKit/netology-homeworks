package task5_2_userAccountOnlineLibraries;

class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к занятию 3.1 Структура класса"
                + " \n Задача 2. Учетная запись пользователя онлайн-библиотеки");
        // public Author(String name, String surname, int birthday, String country)
        // "Автор" (Author) c полями: имя, фамилия, год рождения, страна (name, surname,  birthday, country).
        Author gerbert = new Author("Герберт", "Шилдт", 1951, "США");
        Author pushkin = new Author("Александр", "Пушкин", 1799, "Россия");
        Author tolstoy = new Author("Лев", "Толстой", 1828, "Россия");

        // public Book(String author, int pages, int year) "Книга" (Book) с полями:
        // автор, название книги, количество страниц, год издания (author, pages, year).
        Book javaManual = new Book(gerbert, "Java. Полное руководство, 10 издание ", 1500, 2018);
        Book ruslanAndLyudmila = new Book(pushkin, "Руслан и Людмила", 192, 1820);
        Book fairyTaleFisher = new Book(pushkin, "Сказка о рыбаке и рыбке", 66, 1835);
        Book evgenyOnegin = new Book(pushkin, "Евгений Онегин", 608, 1833);
        Book annaKarenina = new Book(tolstoy, "Анна Каренина", 850, 1878);
        Book warAndPeace = new Book(tolstoy, "Война и мир", 920, 1863);

        // конструктор     public User(String email, String name, String surname, Book book)

        User user = new User("ivan@vk.com", "Ivan", "Petrov", evgenyOnegin);
        System.out.println(user);

        User user1 = new User("fedor@mail.ru", "Fedya", "Ivanov", fairyTaleFisher);
        System.out.println(user1);

        User user2 = new User("markov@gmail.com", "Yura", "Markov", javaManual);
        System.out.println(user2);

        User user3 = new User("evgen@bk.ru", "Evgeny", "Kuznetcov", annaKarenina);
        System.out.println(user3);

        User user4 = new User("alex@vk.com", "Alex", "Sozin", ruslanAndLyudmila);
        System.out.println(user4);

        System.out.println(javaManual);

    }
}