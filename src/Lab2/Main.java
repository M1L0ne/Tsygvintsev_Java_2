package Lab2;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер задачи (от 1 до 6): ");
        Scanner sc = new Scanner(System.in);
        try {
            int taskNum = sc.nextInt();

            switch (taskNum) {
                case 1:
                    Name name = new Name(null, "Клеопатра", null);
                    System.out.println(name);
                    Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
                    System.out.println(name2);
                    Name name3 = new Name("Маяковский", "Владимир", null);
                    System.out.println(name3);
                    break;
                case 2:
                    Human human = new Human("Клеопатра", 152);
                    System.out.println(human);
                    Human human2 = new Human("Пушкин", 167);
                    System.out.println(human2);
                    Human human3 = new Human("Владимир", 189);
                    System.out.println(human3);
                    break;
                case 3:
                    Department department = new Department("IT");
                    Employee employee1 = new Employee("Петров", department);
                    Employee employee2 = new Employee("Козлова", department);
                    Employee employee3 = new Employee("Сидоров", department);

                    department.setHead(employee2);

                    System.out.println(employee1);
                    System.out.println(employee2);
                    System.out.println(employee3);
                    break;
                case 4:
                    Department HR = new Department("HR");
                    Employee HR1 = new Employee("Цыгвинцев", HR);
                    Employee HR2 = new Employee("Дроздов", HR);

                    HR.setHead(HR1);

                    List<Employee> employees = HR.getEmployees();
                    System.out.println(employees);
                    break;
                case 5:
                    System.out.println(new Names("Клеопатра"));
                    System.out.println(new Names("Александр", "Сергеевич", "Пушкин"));
                    System.out.println(new Names("Владимир", "Маяковский"));
                    System.out.println(new Names("Христофор", "Бонифатьевич"));
                    break;
                case 6:
                    Gun gun = new Gun(3);
                    gun.fire();
                    gun.fire();
                    gun.fire();
                    gun.fire();
                    gun.fire();
                    break;
                default:
                    System.out.println("Ошибка: введено число вне диапазона");

            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число");
        }
    }
}
