package task9_1_LibraryInterfaceAndAbstraction;

public interface Supplier extends Reader {

    //Поставщик книг – приносит книги в библиотеку.
    // Также может быть Читателем – берет и возвращает книги.

    void bringBook(String book);

}
