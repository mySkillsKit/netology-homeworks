package ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Чтение из файла");

//        String separator = File.separator;  // separator = "/" or "\" macOs and windows
//        String path = separator + "Users" + separator + "avas" + separator + "Desktop" + separator + "text.txt";

        String path = "/Users/avas/IdeaProjects/HomeWorks/test.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        //String path2 = "/Users/avas/IdeaProjects/HomeWorks/testInt.txt";
        File file2 = new File("testInt.txt");


        // из строки преобразуем массив из int [1, 2, 3, 4]
        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[4];
        int counter = 0;

        for(String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));

       scanner.close();
    }

}