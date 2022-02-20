package Lesson12_AbstractionAndInterface;

public class Car extends Vehicle {
  
  @Override
  public void go(String place) {
    startEngine();
    System.out.println("Едем в " + place);
  }

  private void startEngine() {
    System.out.println("Запустили двигатель!");
  }
}