package lesson10_setAndGet;

import lesson10_setAndGet.library.*;
import lesson10_setAndGet.university.*;

class Main {
  public static void main(String[] args) {

    LibraryWorker librarian = new LibraryWorker(30);
    librarian.setName("Библиотекарь");
    System.out.println(librarian.getName());

    Student student = new Student("Группа");
    student.setName("Студент");
    System.out.println(student.getName());

    Teacher teacher = new Teacher();
    teacher.setName("Учитель");
    System.out.println(teacher.getName());
  }
}