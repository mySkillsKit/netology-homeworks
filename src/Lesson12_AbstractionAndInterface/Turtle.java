package Lesson12_AbstractionAndInterface;

public class Turtle implements Transfer {

  @Override
  public void go(String place) {
    System.out.println("Вези меня, большая черепаха! Вези меня в " + place);
  }
}