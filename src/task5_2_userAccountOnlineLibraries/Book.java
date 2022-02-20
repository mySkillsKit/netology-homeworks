package task5_2_userAccountOnlineLibraries;

public class Book {
    // Класс "Книга" (Book) с полями: автор, название книги, количество страниц, год издания (author, pages, year)

    public Author author;
    public String title;
    public int pages;
    public int year;

    public Book(Author author, String title, int pages, int year) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String toString() {
        return "Название книги: " + "<" + title + ">" + ", количество страниц: " + pages +
                ", год издания: " + year + ", Автор: " + author.name + " " + author.surname;
    }
}
