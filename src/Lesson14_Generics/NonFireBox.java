package Lesson14_Generics;

public class NonFireBox<T extends Fireable> extends Box<T> {

  public NonFireBox(T content) {
    super(content);
  }

}