package task13_2_StudentListHashSet;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("Задача 2 (HashSet). Список студентов");

        Set<Student> studentsHashSet = new HashSet<>();

        Scanner scan = new Scanner(System.in);

        addNewStudent(studentsHashSet,"Сидоров Артем Викторович", "1243-Б", "23424525");
        addNewStudent(studentsHashSet,"Иванов Петр Николаевич", "1243-Б", "31231343");
        addNewStudent(studentsHashSet,"Иванов Петр Николаевич", "1243-Б", "00002222");
        addNewStudent(studentsHashSet,"Петрова Татьяна Михайловна", "1243-Б", "43221343");
        //создадим 2 контакта с studentId как у 4 четвертого
        addNewStudent(studentsHashSet,"Сергеев Сергей Сергеевич", "1243-Б", "43221343");
        addNewStudent(studentsHashSet,"Васильев Анатолий Николаевич", "1243-Б", "43221343");

        System.out.println("Список студентов:");
        for (Student student : studentsHashSet) {
            System.out.println("   - " + student);
        }

        System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");

        String[] input = scan.nextLine().split(", ");
        addNewStudent(studentsHashSet, input[0], input[1], input[2]);

        //System.out.println(Arrays.toString(input));

        while (true) {
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");

            String fieldStudent = scan.nextLine();

            if (fieldStudent.equals("end")) {
                break;
            }

            input = fieldStudent.split(", ");

          //  System.out.println(Arrays.toString(input));
            addNewStudent(studentsHashSet, input[0], input[1], input[2]);
        }

        System.out.println("Список студентов:");
        for (Student student : studentsHashSet) {
            System.out.println("   - " + student.toString());
        }

    }
    private static void addNewStudent(Set<Student> studentsHashSet, String name, String group, String studentId) {
        Student student = new Student(name, group, studentId);

        if (studentsHashSet.add(student)) {
            System.out.println("Cтудент добавлен в список: " + student.toString());
        } else {
            System.out.println("Cтудент: " + student.toString() + " не добавлен," +
                    " тк такой id уже существует в базе");
        }
    }

/*    private static void addNewStudent(Set<Student> studentsHashSet, String name, String group, String studentId) {
        Student student = new Student(name, group, studentId);
        System.out.println(studentsHashSet.add(student));

        if (foundStudentId(studentsHashSet, studentId)) {
            System.out.println("Cтудент добавлен в список: " + student.toString());
            studentsHashSet.add(student);
        } else {
            System.out.println("Cтудент: " + student.toString() + " не добавлен," +
                    " тк такой id уже существует в базе");
        }
    }

    private static boolean foundStudentId(Set<Student> studentsHashSet, String studentId) {

        for (Student student : studentsHashSet) {

            if (student.getStudentId().equals(studentId)) {
                return false;
            }
        }

        return true;
    }*/
}



