package Lesson11_polymorphism;

public class Fish extends Animal {

  
  @Override
  public boolean eat(String food) {
    return "водоросли".equalsIgnoreCase(food);
  }
  
}