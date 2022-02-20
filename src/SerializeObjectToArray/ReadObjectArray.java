package SerializeObjectToArray;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjectArray {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("peopleArray.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personCount = ois.readInt();
            PersonArray[] people = new PersonArray[personCount];

            for (int i = 0; i < personCount; i++) {
                people[i] = (PersonArray) ois.readObject();
            }
            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

