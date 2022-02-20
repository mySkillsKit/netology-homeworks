package Lesson14_Generics;

class Main {
  public static void main(String[] args) {
    Box<TV> tvBox = new Box<>(
      new TV());

    Box<Car> carBox = new Box<>(
      new Car());
      
    Canister<Gasoline> gasolineCanister = new Canister<>(
      new Gasoline());

    NonFireBox<TV> tvNfb = new NonFireBox<>(new TV());
    
    NonFireBox<Gasoline> gasolineNfb = new NonFireBox<>(new Gasoline());
  }
}