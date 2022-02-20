package task13_1_PhoneContactsHashMap;

import java.util.*;

public class PhoneContacts {

    //создадим HashMap: ключом для этой коллекции будет название группы, а значением — коллекция контактов.
    public Map<String, List<Contact>> phoneBook = new HashMap<>();
    public String[] groups = new String[]{"Family", "Friends", "Work"};

    //Создадим методы для добавления группы и контакта в группы в классе PhoneContacts.

    public void createGroup(String group) {

        String[] tempGroups = group.split(" ");
        String newGroups[] = new String[tempGroups.length + groups.length];

        int count = 0;
        for (int i = 0; i < groups.length; i++) {
            newGroups[i] = groups[i];
            count++;
        }
        for (int j = 0; j < tempGroups.length; j++) {

            for (int x = 0; x < groups.length; x++) {
            }
            newGroups[count++] = tempGroups[j];
            groups = newGroups.clone();
        }
    }

    public void addContactToGroups(String selectGroups, Contact contact) {

        String[] selGroups = selectGroups.split(" ");

        for (int i = 0; i < selGroups.length; i++) {

            for (int j = 0; j < groups.length; j++) {
                if (selGroups[i].equals(groups[j])) {
                    putContact(phoneBook, selGroups[i], contact);
                }
            }
        }
    }

    public void putContact(Map<String, List<Contact>> phoneBook, String group, Contact contact) {
        if (phoneBook.containsKey(group)) {
            phoneBook.get(group).add(contact); // добавим в List<Contact> новый контакт с ключем group
        } else {
            List<Contact> list = new ArrayList<>();//если ключа group нет,
            // то создадим новый HashMap c ключем group + List<Contact>
            list.add(contact);
            phoneBook.put(group, list);
        }
    }


    public void printPhoneBook() {

        for (Map.Entry<String, List<Contact>> entry : phoneBook.entrySet()) {
            System.out.format("- %s: \n", entry.getKey());

            for (Contact contact : entry.getValue()) {
                System.out.format("\t\tName: %s %s, phone: %s\n ", contact.getFirstname(), contact.getLastname(), contact.getPhone());
            }

        }

    }


}