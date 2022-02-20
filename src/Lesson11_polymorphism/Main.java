package Lesson11_polymorphism;

class Main {
  public static void main(String[] args) {
    // Animal[] animals = new Animal[5];
    // animals[0] = new Dog();
    // animals[1] = new Parrot();
    // animals[2] = new Cat();
    // animals[3] = new Fish();
    // animals[4] = new Dragon();

    // giveFood("мясо", animals);

    demoOverloading();
  }

  private static void demoOverloading() {
    Dragon dragon = new Dragon();
    System.out.println(
      "Дракону дали покушать телевизор. Ему " + 
          (dragon.eat("Телевизор") ? "" : "НЕ") + 
          " понравилось");
    System.out.println("Тут дракон охотится сам. Ему " + 
          (dragon.eat() ? "" : "НЕ") + 
          " понравилось");
  }

  private static void giveFood(String food, Animal[] animals) {
    boolean isFavourite = false;
    for (Animal animal : animals) {

      

      // switch (animal.getClass().getSimpleName()) {
      //   case "Fish":
      //     isFavourite = "водоросли".equals(food);
      //     break;

      //   case "Dog":
      //     isFavourite = true;
      //     break;
        
      //   case "Cat":
      //     isFavourite = "мясо".equals(food) || "яйцо".equals(food);
      //     break;

      //   case "Parrot":
      //     isFavourite = "зерно".equals(food);
      //     break;

      //   case "Dragon":
      //     isFavourite = "мясо".equals(food);
      //     break;

      //   default: isFavourite = false;

      // }
      System.out.printf(
        "Животному %s было %s\n",
        animal.getClass().getSimpleName(),
        animal.eat(food) ? "вкусно" : "невкусно");
    }
  }
}