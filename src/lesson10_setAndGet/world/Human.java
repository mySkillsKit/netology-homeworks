package lesson10_setAndGet.world;

public class Human {

  String name;
  public int age;

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Human() {
    
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}