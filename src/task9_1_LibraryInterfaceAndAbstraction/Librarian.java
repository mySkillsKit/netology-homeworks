package task9_1_LibraryInterfaceAndAbstraction;

public interface Librarian extends Administrator {
    //Библиотекарь – заказывает книги у постащика
    // Также может выполнять функции Администратора
    // – находит и выдает книги и уведомляет о просрочках времени возврата.

    void orderBook(String book, Supplier supplier);

}
