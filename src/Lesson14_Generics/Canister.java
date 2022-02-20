package Lesson14_Generics;

public class Canister<TYPE extends Liquid & Fireable> {

  private TYPE content;

  public Canister(TYPE content) {
    this.content = content;
  }

  public TYPE getContent() {
    return content;
  }

}