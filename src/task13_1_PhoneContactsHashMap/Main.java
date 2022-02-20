package task13_1_PhoneContactsHashMap;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задача 1 (HashMap). Телефонный справочник");
        Scanner scan = new Scanner(System.in);

        PhoneContacts phoneContacts = new PhoneContacts();


        //создадим несколько контактов
        Contact[] contacts = {
                new Contact("John", "Smith", "+7(911)111-11-11"),
                new Contact("Sam", "Adamsom", "+7(921)341-14-14"),
                new Contact("Tom", "Wilsom", "+7(906)321-24-12"),
                new Contact("Simo", "Kokko", "+7(921)473-34-54")
        };
        // добавим контакты в Map<String, List<Contact>> phoneBook = new HashMap<>();
        phoneContacts.phoneBook.put("Family", new ArrayList<>(Arrays.asList(contacts[0], contacts[1])));
        phoneContacts.phoneBook.put("Work", new ArrayList<>(Arrays.asList(contacts[2], contacts[1], contacts[0])));
        phoneContacts.phoneBook.put("Friends", new ArrayList<>(Arrays.asList(contacts[0])));
        //добавим контакт с помощью метода addContactToGroups
        // в Map<String, List<Contact>> phoneBook = new HashMap<>();
        phoneContacts.addContactToGroups("Work Friends", contacts[3]);


        System.out.println("Программа справочник");
        // выведем на экран существующие контакты
        phoneContacts.printPhoneBook();

        System.out.println("Введите новое название группы контактов:");
        while (true) {
            String group = scan.nextLine();
            if (group.equals("no")) {
                break;
            }
            phoneContacts.createGroup(group);
            System.out.println("Создать еще одну группу (введите название или введите 'no')?");
        }

        while (true) {
            System.out.println("Создать контакт (введите наименование и его номер или введите 'no')?");
            String contactInput = scan.nextLine();
            if (contactInput.equals("no")) {
                break;
            }

            String[] fieldContact = contactInput.split(" ");
            Contact contact = new Contact(fieldContact[0], fieldContact[1], fieldContact[2]);

            System.out.println("Укажите группы контакта через пробел");
            String selectGroups = scan.nextLine();

            phoneContacts.addContactToGroups(selectGroups, contact);

            System.out.println("Создать еще контакт ('yes/no')?");
            String input1 = scan.nextLine();
            if (input1.equals("no")) {
                break;
            }
        }

        System.out.println("Группы в справочнике:");
        // выведем на экран все контакты
        phoneContacts.printPhoneBook();

    }

}