package Lesson12_AbstractionAndInterface;

public class MotorBoat extends Vehicle {

  @Override
  public void go(String place) {
    startEngine();
    System.out.println("Идем курсом на " + place);
  }

  private void startEngine() {
    System.out.println("Запустили двигатель!");
  }
  
}