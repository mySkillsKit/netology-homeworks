package task11_2_EmployeeListArrayList;

public class Employee {
    //Сотрудник имеет следующие атрибуты: фамилия, имя, возраст, пол, образование, должность, отдел
    private String surname;
    private String name;
    private int age;
    private String gender;
    private String education;
    private String position;
    private String department;

    public Employee(String surname, String name, int age,
                    String gender, String education,
                    String position, String department) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.education = education;
        this.position = position;
        this.department = department;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }




    @Override
    public String toString() {
        return
                String.format("%-12s %-10s %-5d %-10s %-10s %-8s %-7s",
                        surname, name, age, gender, education, position, department);
    }
}
