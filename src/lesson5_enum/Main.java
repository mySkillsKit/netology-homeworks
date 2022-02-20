package lesson5_enum;

class Main {

    public static void main(String[] args) {
        Day day  = Day.SAT;

        System.out.println("Holiday ? " + isDayOff(day) + " " + day);

    }
    public static boolean isDayOff(Day day) {
        if (day == Day.SAT || day == Day.SUN)  { // 6 or 7
            return true;
        } else {
            return false;
        }
    }
}



/* class Main {
  public static final int MON = 1;
  public static final int TUE = 2;
  public static final int WED = 3;
  public static final int THU = 4;
  public static final int FRI = 5;
  public static final int SAT = 6;
  public static final int SUN = 7;

  public static void main(String[] args) {
  int day  = SAT;

  System.out.println("Holiday ? " + isDayOff(day) + " " + day);

  }
  public static boolean isDayOff(int day) {
    if (day == SAT || day == SUN)  { // 6 or 7
    return true;
    } else {
      return false;
    }
  }
} */