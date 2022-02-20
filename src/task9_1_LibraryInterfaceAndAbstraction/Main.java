package task9_1_LibraryInterfaceAndAbstraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Библиотека\n «Абстракции и интерфейсы»");

        Reader reader = new ReaderImpl("Вася");
        Reader reader2 = new ReaderImpl("Иван");
        Supplier supplier = new SupplierAndReaderImpl("Сергей");
        Supplier supplier2 = new SupplierAndReaderImpl("Семен");

        Administrator administrator = new AdministratorImpl("Оля");
        Administrator administrator2 = new AdministratorImpl("Катя");

        Librarian librarian = new LibrarianAndAdministratorImpl("Света");
        Librarian librarian2 = new LibrarianAndAdministratorImpl("Ирина");


        // Книги может брать и возвращать Читатель reader и поставщик supplier
        reader.takeBook("Игра Престолов", administrator2);
        reader2.takeBook("Руслан и Людмила", administrator);
        supplier2.takeBook("Игра Престолов", administrator2);
        reader.returnBook("Игра Престолов", administrator);
        supplier2.returnBook("Игра Престолов", administrator);

        // Книги может находить и выдавать администратор administrator и библиотекарь librarian
        administrator.findAndGiveBook("Евгений Онегин", reader);
        administrator2.overdueNotification(reader);
        librarian.findAndGiveBook("Анна Каренина", reader2);
        librarian.overdueNotification(reader2);

        //Поставщик supplier приносит книги
        supplier.bringBook("Война и мир");
        supplier2.bringBook("Сказка о рыбаке и рыбке");


        // Библиотекарь librarian заказывает книгу у поставщика
        librarian.orderBook("Война и мир", supplier);
        librarian2.orderBook("Анна Каренина", supplier2);




    }
}
