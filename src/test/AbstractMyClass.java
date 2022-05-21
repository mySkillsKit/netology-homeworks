package test;
//Для определения абстрактного класса
// используется ключевое слово abstract

//Модификаторы доступа
// Члены абстрактного класса могут иметь
// любой модификатор доступа:
// public, protected, private,
// либо модификатор доступа по умолчанию (package)

//Наследование
// Может расширить (extends) любой другой класс
// и реализовать (implements) не более 65535 интерфейсов

public abstract class AbstractMyClass {

    // Поля	Может иметь как static,
    // так и non-static поля
    // (аналогичное относится и к final)
    String name;
    int id;

    public static final int X = 0;
    private final int C = 2;
    final int Q = 4;

    //Определение конструктора разрешено
    public AbstractMyClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //Реализация методов по умолчанию	Допустима
    void changeName() {
        System.out.println("Name change");
    }

    abstract void abstractChangeId();

}
