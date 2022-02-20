package Lesson18_TreeMap;

import java.util.*;

public class ByFioComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee e1, Employee e2) {
    return e1.getFio().compareTo(e2.getFio());
  }
}