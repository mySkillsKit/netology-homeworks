package Lesson18_TreeMap;

import java.util.*;
import java.time.*;

class Main {
  public static void main(String[] args) {
    Map<Employee, String> employers = new TreeMap<>();
    
    fillAll(employers);
    printAllEmployers(employers);
  }

  private static void printAllEmployers(Map<Employee, String> employers) {
    for (Map.Entry<Employee, String> entry : employers.entrySet()) {
      System.out.println(entry.getKey() + "->" + entry.getValue());
    }
  }

  private static void fillAll(Map<Employee, String> employers) {
    
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        System.out.println("Введите ФИО или \"end\"");
        final String fio = scanner.nextLine();
        if ("end".equals(fio)) break;
        System.out.println("Введите паспорт");
        final String passport = scanner.nextLine();
        putOne(employers, fio, LocalDateTime.now(), passport);
      }
    }
    
  }

  private static void putOne(
        Map<Employee, String> employers,
        String fio,
        LocalDateTime birthdayDate,
        String passport) {
    
    employers.put(
      new Employee(fio, birthdayDate), passport);
  }
}