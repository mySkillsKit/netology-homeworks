package Lesson11_polymorphism;

import java.util.*;

public class Dragon extends Animal {

  
  @Override
  public boolean eat(String food) {
    return "мясо".equalsIgnoreCase(food);
  }

  public boolean eat() {
    String food = hunt();
    System.out.println(food);
    return true;
  }

  private String hunt() {
    String[] select = new String[]{"мамонт", "папонт", "крокодил", "бегемот"};
    int randomNumber = new Random().nextInt();
    randomNumber = Math.abs(randomNumber);
    return select[randomNumber % select.length];
  }
}