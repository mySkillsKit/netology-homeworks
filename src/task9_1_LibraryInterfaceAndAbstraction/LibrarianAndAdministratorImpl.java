package task9_1_LibraryInterfaceAndAbstraction;

public class LibrarianAndAdministratorImpl extends User implements Librarian {
//Библиотекарь – заказывает книги. Также может выполнять функции Администратора
// – находит и выдает книги и уведомляет о просрочках времени возврата.

    public LibrarianAndAdministratorImpl(String name) {
        super(name);

    }

    @Override
    public void orderBook(String book, Supplier supplier) {
        System.out.println("Библиотекарь " + name + " заказывает книгу " +
                "<" + book + "> у поставщика " + supplier);

    }

    @Override
    public void findAndGiveBook(String book, Reader reader) {
        System.out.println("Библиотекарь " + name + " находит и выдает книгу " +
                "<" + book + "> читателю " + reader);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Библиотекарь " + name + " уведомляет читателя " +
                "<" + reader + ">" + " о просрочках времени возврата книги");
    }

}
