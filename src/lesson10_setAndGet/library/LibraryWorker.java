package lesson10_setAndGet.library;

import lesson10_setAndGet.world.Human;

public class LibraryWorker extends Human {

  public LibraryWorker(int age) {
    super("Библиотекарь", age);
  }

  @Override
  public String getName() {
    // String name = super.getName();
    return "Не скажу...";
  }

  @Override
  public void setName(String name) {
    System.out.println("Мне не нравится имя " + name);
  }
  
}