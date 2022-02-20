package lesson5_2_arrayList;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Katya");
        list.add("Petya");
        list.add("Anna");
        System.out.println(list);


        ArrayList list2 = new ArrayList(list);
        list2.remove("Petya"); // удалить петя из 2 списка

        System.out.println("1 " + list);
        System.out.println("2 " + list2);


        System.out.println("___________________");

        ArrayList list3 = new ArrayList();
        list3.add("Katya");
        list3.add("Petya");
        list3.add("Anna");

        ArrayList list4 = new ArrayList();
        list4.add("Katya");
        list4.add("Petya");
        list4.add("Anna");

        System.out.println("3 " + list3);
        System.out.println("4 " + list4);

        System.out.println("сравнение списков(адреса сравниваются) поэтому будет false = " + (list3 == list4));
        System.out.println("Надо сравнивать списки с помощью equals будет true = " + (list3.equals(list4)));
    }
}