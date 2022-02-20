package task9_1_LibraryInterfaceAndAbstraction;

public interface Reader {

    //Читатель или поставщик – берет и возвращает книги.
    void takeBook(String book, Administrator administrator);

    void returnBook(String book, Administrator administrator);

}
