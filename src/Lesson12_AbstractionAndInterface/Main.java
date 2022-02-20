package Lesson12_AbstractionAndInterface;

class Main {
  public static void main(String[] args) {

    Transfer[] garage = new Transfer[4];

    garage[0] = new Airplane();
    // garage[0].fillFuelTank(2000);

    garage[1] = new Car();
    // garage[1].fillFuelTank(60);

    garage[2] = new MotorBoat();
    // garage[2].fillFuelTank(50);

    garage[3] = new Turtle();

    // garage[4] = new WashingMachine();

    goAll(garage, "Магадан");

    Dragon d = new Dragon();

    // Vehicle vehicle = new Vehicle();
    // vehicle.fillFuelTank(5);
    // vehicle.go("Луна");

    int val = Transfer.SOME_PARAM;
  }

  private static void goAll(Transfer[] garage, String place) {
    for (Transfer vehicle : garage) {
      vehicle.go(place);
    }
  }
}