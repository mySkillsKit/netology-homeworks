package task5_1_classStructureOnlineReader;

public class Book {
    public static double maxRating = 0.0; // максимальный рейтинг книги
    public static int counter = 0; //счетчик количества книг
    public static int maxCounter = 0; // максимального Количество книг которое в онлайн-читалке

    public String name;  // поле Название книги
    public String author; // Автор книги
    public String genre; // Жанр книги
    public int quantityOfPages; // поле Количество страниц
    public int yaerOfPublication;    // Год издания
    public double rating;   // Рейтинг популярности книги

    // конструктор
    public Book(String name, String author, String genre, int quantityOfPages, int yaerOfPublication, double rating) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.quantityOfPages = quantityOfPages;
        this.yaerOfPublication = yaerOfPublication;
        this.rating = rating;
        counter ++;
        maxRating = Math.max(maxRating, rating); // Math для определения макс рейтийга популярности книги
        maxCounter = Math.max(maxCounter, counter); // максимальное количество книг
    }
    // метод класса поиск книги с рейтингом > 9
    public void theBestBook()  {
        if (rating > 9.0) {
            System.out.println("\n * Входит в рейтинг самые читаемые книги в 2021 (Рейтинг > 9)");
        }
    }
    // метод название книги с максимальным рейтингом
    public void maxRatingNameBook()  {
        if (rating == maxRating ) {
            System.out.println(name); // название книги с максимальным рейтингом
        }
    }
    // метод вывод на экран
    public String toString() {
        return "\n ************************" + "\n Рейтинг популярности [" + rating + "]" + "\n Название книги № " + counter +": " + name + "\n Автор: " + author + "\n Жанр: " + genre + "\n Количество страниц: " + quantityOfPages + "\n Год издания: " + yaerOfPublication ;
    }
}