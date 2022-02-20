package task8_1_gameShooter;

import task8_1_gameShooter.weapon.*;

//Класс Player содержит список оружия и метод "выстрелить"
class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока" 
    private Weapon[] weaponSlots;
    
    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
            //  заполняем слоты оружием
            new AutomaticGun(),
            new Gun(),
            new Rpg(),
            new Slingshot(),
            new WaterGun()
        };
    }
    
    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }
    
    public void shotWithWeapon(int slot) {
        // проверим на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль
        if (slot > weaponSlots.length || slot == 0) {
          System.out.println("Некорректно указали номер слота с оружием, у вас " + weaponSlots.length + " слотов с оружием");
        } else {
 // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot-1];
        // Огонь!
        System.out.print("Вы выбрали " + weapon.getClass().getSimpleName() + ": ");
        weapon.shot(); // выводим на экран какое оружие выбрал игрок
        }
    }
}
