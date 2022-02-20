package task9_1_LibraryInterfaceAndAbstraction;

public class SupplierAndReaderImpl extends User implements Supplier {
// Поставщик книг – приносит книги в библиотеку.
// Также может быть Читателем – берет и возвращает книги.

    public SupplierAndReaderImpl(String name) {
        super(name);
    }

    @Override
    public void bringBook(String book) {
        System.out.println("Поставщик книг " + name + " приносит " +
                "книгу <" + book + "> в библиотеку");
    }

    @Override
    public void takeBook(String book, Administrator administrator) {
        System.out.println("Поставщик книг <" + name + "> берет книгу: " +
                "<" + book + "> у Администратора " + administrator);
    }

    @Override
    public void returnBook(String book, Administrator administrator) {
        System.out.println("Поставщик книг <" + name + "> возвращает книгу " +
                "<" + book + "> Администратору " + administrator);
    }


}
