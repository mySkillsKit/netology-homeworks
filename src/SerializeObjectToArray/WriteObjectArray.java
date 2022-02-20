package SerializeObjectToArray;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectArray {
    public static void main(String[] args) {
        PersonArray[] people = {
                new PersonArray(1,"Bob"),
                new PersonArray(2, "Mike"),
                new PersonArray(3, "Mark")
                };

        try {
            FileOutputStream fos = new FileOutputStream("peopleArray.bin");
            ObjectOutputStream oss = new ObjectOutputStream(fos);

            oss.writeInt(people.length);
            for(PersonArray person: people){
                oss.writeObject(person);
            }

            oss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File 'peopleArray.bin' recorded ");

    }

}
