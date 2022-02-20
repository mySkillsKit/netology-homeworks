package task11_2_EmployeeListArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static int empIndex;

    public static void main(String[] args) {
        System.out.println("Домашнее задание к занятию 4.1 Коллекции List\n" +
                "Задача 2. Список сотрудников");

        List<Employee> employeeList = new ArrayList<>();

        //для примера создадим несколько сотрудников

        Employee emp1 = new Employee("Иванов", "Петр", 35, "мужской", "высшее", "инженер", "Н-12");
        employeeList.add(emp1);
        Employee emp2 = new Employee("Семенов", "Николай", 28, "мужской", "высшее", "инженер", "Н-12");
        employeeList.add(emp2);
        Employee emp3 = new Employee("Ситникова", "Татьяна", 29, "женский", "высшее", "инженер", "Н-12");
        employeeList.add(emp3);

        // выведем на экран сотрудников
        printList(employeeList);


        while (true) {
            // цикл ввода новых сотрудников

            System.out.println("Введите информацию о сотруднике" +
                    " (фамилия, имя, возраст, пол, образование, должность, отдел)");
            //Сохраним атрибуты в переменные
            String surname = scanner.next();
            String name = scanner.next();
            int age = scanner.nextInt();
            String gender = scanner.next();
            String education = scanner.next();
            String position = scanner.next();
            String department = scanner.next();
            // Используя конструктор создадим объект Employee emp = new Employee(...);

            Employee emp = new Employee(surname, name, age, gender, education, position, department);
            employeeList.add(emp); // добавим объект в лист ArrayList


            System.out.println("Если хотите закончить ввод данных, введите end");
            String input = scanner.next();

            if (input.equals("end")) {
                // если end вывод информации о сотрудниках
                printList(employeeList);
                // вызов метода изменить сотрудника.
                changeEmployee(employeeList);
            }
        }
    }

    // метод changeEmployee изменения сотрудника
    private static void changeEmployee(List<Employee> employeeList) {

        while (true) {

            System.out.println("Если не хотите менять данные, введите end");
            String inputСhangeEmployee = scanner.next();
            if ("end".equals(inputСhangeEmployee)) {
                break;
            }


            System.out.println("Введите фамилию и имя работника, для которого хотите изменить данные");
            String surname = scanner.next();
            String name = scanner.next();

            empIndex = searchBySurname(surname, name, employeeList);// вызов метода поиска сотрудника по ФИО

            if (empIndex != -1) {
                // Если сотрудник найден и индекс не равен -1,
                //то необходимо, спрашивая пользователя
                //"Меняем [имя_атрибута]?", перебрать все атрибуты

                Employee empChange = employeeList.get(empIndex);
                System.out.println("Найден сотрудник: \n" + empChange);


                if (yesChange("Фамилию")) {
                    String surnameChange = scanner.next();
                    empChange.setSurname(surnameChange);
                }

                if (yesChange("Имя")) {
                    String nameChange = scanner.next();
                    empChange.setName(nameChange);
                }

                if (yesChange("Возраст")) {
                    int ageChange = scanner.nextInt();
                    empChange.setAge(ageChange);
                }

                if (yesChange("Пол")) {
                    String genderChange = scanner.next();
                    empChange.setGender(genderChange);
                }

                if (yesChange("Образование")) {
                    String educationChange = scanner.next();
                    empChange.setEducation(educationChange);
                }


                if (yesChange("Должность")) {
                    String positionChange = scanner.next();
                    empChange.setPosition(positionChange);
                }


                if (yesChange("Отдел")) {
                    String departmentChange = scanner.next();
                    empChange.setDepartment(departmentChange);
                }


                System.out.println("Cотрудник изменен");
                printList(employeeList);
            }

        }

        //  вывод данных обо всех сотрудниках с помощью цикла foreach
        System.out.println("Список всех сотрудников:");
        System.out.println("   Фамилия      Имя     Возраст   Пол   Образование  Должность Отдел");
        int i = 1;
        for (Employee employee : employeeList) {
            System.out.println(i + ". " + employee);
            i++;
        }
    }

    private static void printList(List<Employee> employeeList) {
        // вывод информации о сотрудниках на экран с помощью цикла for
        System.out.println("Список сотрудников:");
        System.out.println("   Фамилия      Имя     Возраст   Пол   Образование  Должность Отдел");

        for (int i = 0; i < employeeList.size(); i++)
            System.out.printf("%d. %s\n", i + 1, employeeList.get(i));

    }

    private static int searchBySurname(String surname, String name, List<Employee> employeeList) {
        //поиск индекса сотрудника внутри employeeList с таким же именем и фамилией

        for (int i = 0; i < employeeList.size(); i++) {
            empIndex = ((employeeList.get(i).getSurname().equals(surname))
                    && (employeeList.get(i).getName().equals(name))) ? i : -1;
            if (empIndex != -1) {
                break;
            }
        }
        return empIndex;
    }

    private static boolean yesChange(String nameAttribute) {
        // метод проверки true/false менять ли значение
        // Атрибута (фамилия, имя, возраст, пол, образование, должность, отдел)

        System.out.println("Меняем " + nameAttribute + " ? / Введите Да");
        String inputYesChange = scanner.next();
        if ("Да".equals(inputYesChange)) {
            System.out.println("Введите " + nameAttribute + " сотрудника");
            return true;
        }
        return false;
    }


}
