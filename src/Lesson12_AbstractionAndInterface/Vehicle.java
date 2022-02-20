package Lesson12_AbstractionAndInterface;

public abstract class Vehicle implements Transfer {

  private int fuelInLiters;

  @Override
  public abstract void go(String place);

  public void fillFuelTank(int additionLiters) {
    fuelInLiters += additionLiters;
  }


}