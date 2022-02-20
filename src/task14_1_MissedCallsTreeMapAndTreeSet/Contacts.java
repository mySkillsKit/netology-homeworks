package task14_1_MissedCallsTreeMapAndTreeSet;

import java.util.*;

public class Contacts {
    // Для хранения контактов используем HashMap,
    // в качестве ключа использовать номер телефона,
    // а в качестве значения хранить контактные данные.
    private Map<String, Contact> contacts = new HashMap<>();

    public Map<String, Contact> getContacts() {
        return contacts;
    }

    public void addContact(String[] fieldContact, Group group) {
        Contact contact = new Contact(fieldContact[0], fieldContact[1], fieldContact[2], group);
        contacts.put(fieldContact[2], contact);
    }


    public void printContacts() {
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }


    public void putHashMap(String phone, Contact contact) {
        contacts.put(phone, contact);
    }


    public boolean removeContact(String name, String surname) {
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            if (name.equals(entry.getValue().getName()) && surname.equals(entry.getValue().getSurname())) {
                contacts.remove(entry.getKey());
                return true;
            }
        }
        return false;
    }


    public boolean searchContactByPhone(String phone) {
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            if (phone.equals(entry.getKey())) return true;
        }
        return false;
    }
}

/*
 * Нужно реализовать следующие public методы:
 * Добавление контакта (имя, фамилия, номер телефона, группа контакта: работа,
 * друзья, семья).
 * Удаление контакта по имени и фамилии.
 *  Поиск контакта по номеру.
 */
