package test;
//Для наследования от абстрактного класса
// используется ключевое слово extends

//Для реализации интерфейса используется
// ключевое слово implements

public class Main extends AbstractMyClass implements InterfaceMy, InterfaceMy2 {

    public Main(String name, int id) {
        super(name, id);
    }

    public static void main(String[] args) {
        Main test = new Main("test", 1);
        test.changeName();
        test.abstractChangeId();

        System.out.println(InterfaceMy.name + InterfaceMy.a);
        test.myMethodInterface();
        test.myDefaultMethodInterface();
        InterfaceMy.myStaticMethodInterface();

        System.out.println(InterfaceMy2.name + InterfaceMy2.a);
        test.myMethodInterface2();

    }

    @Override
    void abstractChangeId() {
        System.out.println("abstractChangeId");

    }

    //public !!!
    @Override
    public void myMethodInterface() {
        System.out.println("myMethodInterface()");
    }

    @Override
    public void myMethodInterface2() {
        System.out.println("myMethodInterface2()");

    }
}
