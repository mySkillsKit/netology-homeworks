package task9_1_LibraryInterfaceAndAbstraction;

public class AdministratorImpl extends User implements Administrator {

    public AdministratorImpl(String name) {
        super(name);

    }

    @Override
    public void findAndGiveBook(String book, Reader reader) {
        System.out.println("Администратор " + name + " находит и выдает книгу " +
                "<" + book + "> читателю " + reader);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + name + " уведомляет читателя " +
                "<" + reader + "> " + "о просрочках времени возврата книги");
    }
}
