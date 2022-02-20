package Lesson15_ArrayListAndLinkedList;

import java.util.*;

class Main {
  public static void main(String[] args) {

    List<String> additionalStudents = new ArrayList<>();
    additionalStudents.add("Вячеслав Магергут");
    additionalStudents.add("Алексей Сорокин");
    additionalStudents.add("Анатолий Васильев");

    List<String> students = new LinkedList<>(additionalStudents);
    // students.addAll(additionalStudents);
    students.add("Илья");
    students.add("Сергей Прекраснов");
    students.add("Станислав Хомяков");
    students.add("Екатерина Подаваленко");
    students.add("Юлия Кузьмина");

    students.add(4, "Роман");

    

    printList(students);

    System.out.println(students.isEmpty() ? "Студентов нет" : "Студентов много");

    System.out.println("Всего студентов: " + students.size());
  }

  private static void printList(List<String> students) {
    // for (String student : students) {
    //   System.out.println(student);
    // }

    // for (int i = 0; i < students.size(); i++) {
    //   System.out.printf("%d. %s\n", i + 1, students.get(i));
    // }
    
    Iterator<String> iter = students.iterator();

    while (iter.hasNext()) {
      System.out.println(iter.next());
    }
  }
}