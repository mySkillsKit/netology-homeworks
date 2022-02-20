package task9_1_LibraryInterfaceAndAbstraction;

public abstract class User {


    public String name;

    public User(String name) {
        this.name = name;
    }

     @Override
    public String toString() {
        return name;
    }
    
}
