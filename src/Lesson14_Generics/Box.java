package Lesson14_Generics;

public class Box<TYPE> {

  private TYPE content;

  public Box(TYPE content) {
    this.content = content;
  }

  public TYPE getContent() {
    return content;
  }
}