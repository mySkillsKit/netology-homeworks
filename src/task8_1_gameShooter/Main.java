package task8_1_gameShooter;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Player player = new Player();
    // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
    System.out.format("У игрока %d слотов с оружием," + " введите номер, чтобы выстрелить," + " -1 чтобы выйти%n",
        player.getSlotsCount());

    int slot;
    // TODO главный цикл игры:
    // запрашивать номер с клавиатуры
    // с помощью scanner.nextInt(),
    // пока не будет введено -1
    while (true) {
      slot = scanner.nextInt();
      if (slot == -1) {
       break;
      }
      player.shotWithWeapon(slot);
    }
    System.out.println("Game over!");
  }
}