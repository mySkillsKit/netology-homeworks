package lesson6_singer;

class Main {

    public static void main(String[] args) {

        System.out.println(" max rating = " + Singer.maxRating);


        Singer singer = new Singer("Petya", 28 , 3);
        System.out.println(singer.isTooYoung());




        System.out.println(singer.toString()); // вывести Object на экран
        System.out.println(" max rating = " + Singer.maxRating);

        Singer singer2 = new Singer("2PAc", 34);
        System.out.println(singer2);

        System.out.println(" max rating = " + Singer.maxRating);

        Album album = new Album("superhit", singer, 2020);
        System.out.println(album);
        int sum = sum(1, 3);

    }

    public static int sum(int a, int b) {
        return a + b;
    }


}


/* class Main {
  public static void main(String[] args) {

    A.x = 5; // обращение к х А(имя класса). статическое поле глобальная ячейка


    Singer singer = new Singer();  // Singer(-тип) singer(-название переменной) = new Singer();Object
    singer.name = "Petya"; // singer.name (- name-поле) = "Petya"
    singer.age = 8;
    singer.rating = 3;
    System.out.println(singer.isTooYoung()); // обращение к нестатическому методу


    Singer singer2 = new Singer();  // Object
    singer2.name = "2PAc";
    singer2.age = 25;
    singer2.rating = 5;
    System.out.println(singer2.isTooYoung());

    System.out.println(singer.toString()); // вывести Object на экран



    singer.sing("Happy Birthday");

    System.out.println(singer.name + " + " + singer2.name);
    // singer.name = "Anatoly"; // заменить имя

  }
public static void doSmth(Singer singer) {

}

} */