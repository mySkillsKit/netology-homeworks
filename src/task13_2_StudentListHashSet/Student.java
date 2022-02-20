package task13_2_StudentListHashSet;

import java.util.Objects;

public class Student {

    private String name;
    private String group;
    private String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public String getStudentId() {

        return studentId;
    }


    @Override
    public String toString() {
        return name + ", " + group + ", " + studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || !obj.getClass().equals(Student.class)) return false;
        Student altStudent = (Student) obj;

        return this.studentId.equals(altStudent.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }



}
