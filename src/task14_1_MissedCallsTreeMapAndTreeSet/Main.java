package task14_1_MissedCallsTreeMapAndTreeSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к занятию «Коллекции TreeMap и TreeSet»\n" +
                "Задача 1. Пропущенные вызовы\n");

        Scanner scan = new Scanner(System.in);
        MissedCalls missedCalls = new MissedCalls();
        Contacts contacts = new Contacts();


        Contact[] contactList = {
                new Contact("John", "Smith", "+7(911)111-11-11", Group.WORK),
                new Contact("Sam", "Adamsom", "+7(921)341-14-14", Group.WORK),
                new Contact("Tom", "Wilsom", "+7(906)321-24-12", Group.FRIENDS),
                new Contact("Simo", "Kokko", "+7(921)473-34-54", Group.FAMILY),
        };


        contacts.putHashMap(contactList[0].getPhone(), contactList[0]);
        contacts.putHashMap(contactList[1].getPhone(), contactList[1]);
        contacts.putHashMap(contactList[2].getPhone(), contactList[2]);
        contacts.putHashMap(contactList[3].getPhone(), contactList[3]);


        System.out.println("Список контактов");
        contacts.printContacts();


        System.out.print("Поиск контакта по номеру +7(921)341-14-14 ---> ");
        if (contacts.searchContactByPhone("+7(921)341-14-14")) {
            System.out.println("Контакт по номеру найден");
        } else {
            System.out.println("Контакт не найден");
        }


        System.out.print("Удаление контакта по имени Tom Wilsom ---> ");
        if (contacts.removeContact("Tom", "Wilsom")) {
            System.out.println("Контакт удален!");
        } else {
            System.out.println("Контакт не удален! контакта нет в списке!");
        }


        System.out.println("Список контактов");
        contacts.printContacts();


        System.out.println("\n Программа: пропущенные вызовы.");

        while (true) {

            System.out.println("Меню:\n" +
                    "1. Добавить контакт\n" +
                    "2. Добавить пропущенный вызов\n" +
                    "3. Вывести все пропущенные вызовы\n" +
                    "4. Очистить пропущенные вызовы\n" +
                    "5. Выход ");

            System.out.println("Выберите пункт из меню (1-4):");

            int input = scan.nextInt();
            if (input == 5) {
                break;
            }
            scan.nextLine();

            switch (input) {
                case 1:
                    System.out.println("Добавьте контакт " +
                            "(имя фамилия телефон)");
                    String[] fieldContact = scan.nextLine().split(" ");

                    System.out.println("Добавьте контакт в группу:\n" +
                            "1. WORK(Работа)\n" +
                            "2. FRIENDS(Друзья)\n" +
                            "3. FAMILY(Семья)");
                    System.out.println("Выберите группу контактов (1-3):");
                    int inputGpoup = scan.nextInt();

                    if (inputGpoup == 1 || inputGpoup == 2 || inputGpoup == 3) {
                        System.out.println("Контакт добавлен");
                        contacts.addContact(fieldContact, selectGroup(inputGpoup));
                    } else {
                        System.out.println("Контакт не добавлен тк неправильно указана группа");
                    }

                    System.out.println("Список контактов");
                    contacts.printContacts();
                    break;

                case 2:
                    System.out.println("Добавьте номер пропущенного вызова");
                    String inputMissedCall = scan.nextLine();
                    missedCalls.addMissedCall(inputMissedCall);
                    break;
                case 3:
                    System.out.println("Список пропущенных вызовов:");
                    missedCalls.listMissedCalls(contacts.getContacts());
                    break;
                case 4:
                    System.out.println("Очистить пропущенные вызовы");
                    missedCalls.cleanListMissedCalls();
                    break;

                default:
                    System.out.println("Неправильный ввод!");

            }

        }

    }

    private static Group selectGroup(int inputGpoup) {

        if (inputGpoup == 1) {
            return Group.WORK;
        } else if (inputGpoup == 2) {
            return Group.FRIENDS;
        } else {
            return Group.FAMILY; // (inputGpoup == 3)
        }

    }


}

    /*Добавление контакта (имя, фамилия, номер телефона, группа контакта: работа, друзья, семья).
        Добавление пропущенного вызова.
        Вывод всех пропущенных вызовов с указанием фамилии и имени.
        Если контакта нет в списке контактов, вывести только номер телефона.
        Очистка пропущенных вызовов.
        Завершить работу программы (выход).*/