package lesson6_singer;

public class Singer {
    public static int maxRating = 0;

    public String name;  // эти ячейки называются поля
    public int age;      // (нестатические) поля
    public int rating;    // (нестатические) поля

    // конструтор
    public Singer(String name, int age, int rating) { // (String name, int age, int rating - параметры конструктора)
        this.name = name; // this.name (поле name ) = name(параметр);
        this.age = age;
        this.rating = rating;
        maxRating = Math.max(maxRating, rating); // Math отдельный класс для определения макс рейтийга
    }

    // конструтор2
    public Singer(String name, int age) {
        this.name = name;
        this.age = age;
        this.rating = 10;
        maxRating = Math.max(maxRating, rating);
    }


    // неститический метод
    public boolean isTooYoung() {
        if (age < 10) {
            return true;
        } else {
            return false;
        }
    }
    // return age < 10; // можно в одну строку написатью вместо if
    public void sing(String verse) {
        System.out.println("я " + name + ", пою тебе:  " + verse);

    }
    public String toString() {
        return  "[" + rating + "] " + name + " (" + age + " лет)";
    }
}