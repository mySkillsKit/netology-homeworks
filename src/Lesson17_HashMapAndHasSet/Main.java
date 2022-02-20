package Lesson17_HashMapAndHasSet;

import java.util.*;

class Main {
  
  private static Map<Human, Integer> weights = new HashMap<>();
  private static Set<Human> employers = new HashSet<>();

  public static void main(String[] args) {

    addNewHuman("Петя", "Петров", 50);
    addNewHuman("Иван", "Иванов", 60);
    addNewHuman("Сидор", "Сидоров", 70);
    addNewHuman("Алексей", "Алексеев", 80);

    for (Human human : employers) {
      System.out.println(human);
    }

    // printValues(weights);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите, пожалуйста, имя...");
    String[] input = scanner.nextLine().split("\\s+");
    Human targetHuman = new Human(input[0], input[1]);

    // System.out.println(weights.get(targetHuman));

    System.out.println(
      employers.contains(targetHuman) ?
          "Работник найден" : "Нет такого сотрудника");
  }

  private static void addNewHuman(String firstName, String lastName, int weight) {
    Human human = new Human(firstName, lastName);
    weights.put(human, weight);
    employers.add(human);
  }

  private static void print(Map<Human, Integer> storage) {
    for (Map.Entry<Human, Integer> entry : storage.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
  }

  private static void printKey(Map<Human, Integer> storage) {
    for (Human human : storage.keySet()) {
      System.out.println(human);
    }
  }

  private static void printValues(Map<Human, Integer> storage) {
    for (Integer weight : storage.values()) {
      System.out.println(weight);
    }
  }
}