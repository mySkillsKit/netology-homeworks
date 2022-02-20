package lesson10_setAndGet.university;

import lesson10_setAndGet.world.*;

public class Student extends Human {

  private String group;

  public Student(String group) {
    super("Студент", 18);
    this.group = group;
  }
}