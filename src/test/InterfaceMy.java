package test;
//Для определения интерфейса используется
// ключевое слово interface

//Модификаторы доступа
//Члены интерфейса по умолчанию являются
// public (и иной модификатор доступа иметь не могут)

//Может расширить (extends) не более 65535 интерфейсов

public interface InterfaceMy {
    //Любое поля интерфейса по умолчанию
// является public static final (и иных иметь не может)
    String name = "InterfaceMy "; // public static final  String name = "InterfaceMy";
    int a = 20; //public static final int a = 20;

///Объявление/определение конструктора запрещено

    //Реализация методов по умолчанию
    //Вплоть до Java 8 разрешено только объявлять методы,
    // но реализация их запрещена.
    // Начиная с Java 8 стала допустима
    // реализация static методов,
    // а реализация non-static методов
    // стала доступна посредством ключевого слова default

    void myMethodInterface();

    static void myStaticMethodInterface() {
        System.out.println("myStaticMethodInterface()");
    }

    default void myDefaultMethodInterface() {
        System.out.println("myDefaultMethodInterface()");
    }


}


