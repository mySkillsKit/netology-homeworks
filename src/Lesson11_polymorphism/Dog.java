package Lesson11_polymorphism;

public class Dog extends Animal {
  

  @Override
  public boolean eat(String food) {
    return !"обогащенный уран".equalsIgnoreCase(food);
  }
  
}