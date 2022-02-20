package SerializeObjectToFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oss = new ObjectOutputStream(fos);

            oss.writeObject(person1);
            oss.writeObject(person2);

            oss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("файл people.bin записан");


    }


}
