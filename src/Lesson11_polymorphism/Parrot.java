package Lesson11_polymorphism;

public class Parrot extends Animal {

  public void talk() {
    System.out.println("Попка - дурррак!");
  }

  
  @Override
  public boolean eat(String food) {
    return "зерно".equalsIgnoreCase(food);
  }
}