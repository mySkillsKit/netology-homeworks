package task13_1_PhoneContactsHashMap;

import java.util.Objects;

public class Contact {

    // класс Contact c полями: имя и номер телефона (при необходимости переоределим hashCode, equals, toString)
    private String firstname;
    private String lastname;
    private String phone;

    public Contact(String firstname, String lastname, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }


    @Override
    public String toString() {
        return firstname + " " + lastname + " " + phone;

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(Contact.class)) return false;
        Contact altContact = (Contact) obj;

        return this.lastname.equals(altContact.lastname)
                && this.firstname.equals(altContact.firstname);

    }


    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, phone);
    }


}