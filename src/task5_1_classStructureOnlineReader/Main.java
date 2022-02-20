package task5_1_classStructureOnlineReader;

class Main {
    public static void main(String[] args) {
        System.out.println("3.1 Структура класса Задача 1. Онлайн-читалка");

        // создаем объекты public Book(String name, String author, String genre, int quantityOfPages, int yaerOfPublication, double rating)

        Book book = new Book("Гарри Поттер и узник Азкабана", "Роулинг Джоан Кэтлин" , "Фэнтези" , 250, 2007, 9.2);
        System.out.println(book);
        book.theBestBook();

        Book book1 = new Book("Приключения Шерлока Холмса", "Дойл Артур Конан" , "Классические детективы" , 123, 1982, 8.4);
        System.out.println(book1);
        book1.theBestBook();

        Book book2 = new Book("Для чайников Java. 7-е изд", "Берд Б." , "Нехудожественная литература" , 96, 2019, 9.2);
        System.out.println(book2);
        book2.theBestBook();

        Book book3 = new Book("Крестный отец", " Пьюзо Марио" , "Классика" , 120, 2005, 6.1);
        System.out.println(book3);
        book3.theBestBook();

        Book book4 = new Book("Энциклопедический словарь", "Брокгауз Фридрих Арнольд, Ефрон Илья Абрамович" , "Энциклопедии" , 180, 1996, 5.2);
        System.out.println(book4);
        book4.theBestBook();

        Book book5 = new Book("Воевода", "Ланцов Михаил Алексеевич" , "История" , 59, 2001, 5.3);
        System.out.println(book5);
        book5.theBestBook();

        // Выводим на консоль сколько книг в системе
        System.out.println("\n _____________________" + "\n Итого книг в 'Онлайн-читалке': " + Book.maxCounter + " шт.");

        // Выводим на консоль книги с максимальным рейтингом
        System.out.println("\n _____________________" + "\n Самая популярная книга с максимальным рейтингом: " + "[" + Book.maxRating + "]" );
        book.maxRatingNameBook();
        book1.maxRatingNameBook();
        book2.maxRatingNameBook();
        book3.maxRatingNameBook();
        book4.maxRatingNameBook();
        book5.maxRatingNameBook();

    }
}