package Lesson12_AbstractionAndInterface;

public class Airplane extends Vehicle {
  
  @Override
  public void go(String place) {
    startEngine();
    System.out.println("Летим в " + place);
  }

  private void startEngine() {
    System.out.println("Запустили левый двигатель!");
    System.out.println("Запустили правый двигатель!");
  }
}