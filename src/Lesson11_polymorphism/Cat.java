package Lesson11_polymorphism;

public class Cat extends Animal {

  private String favouriteFood = "Мясо";

  @Override
  public boolean eat(String food) {
    return "мясо".equalsIgnoreCase(food) || "яйцо".equalsIgnoreCase(food);
  }
}