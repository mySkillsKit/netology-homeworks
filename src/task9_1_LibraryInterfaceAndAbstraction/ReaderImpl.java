package task9_1_LibraryInterfaceAndAbstraction;

public class ReaderImpl extends User implements Reader {
// Читатель – берет и возвращает книги.

    public ReaderImpl(String name) {
        super(name);

    }

    @Override
    public void takeBook(String book, Administrator administrator) {
        System.out.println("Читатель <" + name + "> берет книгу: " +
                "<" + book + "> у Администратора " + administrator);
    }

    @Override
    public void returnBook(String book, Administrator administrator) {
        System.out.println("Читатель <" + name + "> возвращает книгу " +
                "<" + book + "> Администратору " + administrator);
    }

}
