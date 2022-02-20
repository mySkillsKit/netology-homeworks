package task18_1_SinglyLinkedList;

public class Main {
    public static void main(String[] arg) {
        System.out.println("Домашнее задание к занятию 4. Списки\n Односвязный стек\n");
        SinglyLinkedList stack = new SinglyLinkedList();

        stack.printme();
        for (int i = 0; i < 6; i++) {
            System.out.println();
            System.out.println(" Добавим " + i);
            stack.push(i);
            stack.printme();

        }
        for (int i = 0; i < 6; i++) {
            System.out.println("\n Снимем со стека");
            stack.pop();
            stack.printme();

        }

    }

}
