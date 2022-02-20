package SerializeObjectToArrayV1;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjectArray {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("peopleArray.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

             PersonArray[] people = (PersonArray[]) ois.readObject();
            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

