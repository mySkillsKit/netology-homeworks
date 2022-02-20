package task9_1_LibraryInterfaceAndAbstraction;

public interface Administrator {
    //Администратор или Библиотекарь – находит и выдает книги и уведомляет о просрочках времени возврата.

    void findAndGiveBook(String book, Reader reader);

    void overdueNotification(Reader reader);

}
