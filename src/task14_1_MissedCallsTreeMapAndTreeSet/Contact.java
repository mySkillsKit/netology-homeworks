package task14_1_MissedCallsTreeMapAndTreeSet;

import java.util.Objects;

public class Contact {

    private String name;
    private String surname;
    private String phone;
    private Group gpoup;

    public Contact(String name, String surname, String phone, Group gpoup) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.gpoup = gpoup;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }


    public void setName(String name) {
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phone, contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone);
    }


    @Override
    public String toString() {
        return "Contact {" +
                "Имя " + name +
                ", Фамилия " + surname +
                ", группа " + gpoup +
                '}';
    }


}
