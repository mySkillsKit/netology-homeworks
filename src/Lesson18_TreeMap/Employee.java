package Lesson18_TreeMap;

import java.time.*;

public class Employee {//implements Comparable<Employee> {

  private LocalDateTime birthdayDate;
  private String fio;

  public Employee(String fio, LocalDateTime birthdayDate) {
    this.birthdayDate = birthdayDate;
    this.fio = fio;
  }

  public String getFio() {
    return fio;
  }

  @Override
  public String toString() {
    return String.format("%s (%s)", fio, birthdayDate);
  }

  // @Override
  public int compareTo(Employee e) {
    return birthdayDate.compareTo(e.birthdayDate);
  }
}