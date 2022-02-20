package lesson5_1_stringBuilder;

class Main {
    public static void main(String[] args) {
        System.out.println("_______StringBuider!____________");

        final int N = 1_000_000;

        System.out.println("Start");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i % (N / 100) == 0 ) System.out.println((i / (N / 100)) + " %....");
            sb.append('!');
        }
        String s = sb.toString();
        System.out.println("Finnish!");
        System.out.println("Generated string with " + s.length() + " length");


        System.out.println("_______StringBuider!_the end___________");



/* final int N = 1_000_000;
    System.out.println("Start");
    String s = "";
    for (int i = 0; i < N; i++) {
      if (i % (N / 100) == 0 ) System.out.println((i / (N / 100)) + " %....");
      s = s + "!";
    }
    System.out.println("Finnish!");

    System.out.println("Generated string with " + s.length() + " length");
    */
    }
}