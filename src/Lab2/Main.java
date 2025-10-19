package Lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер задачи (от 1 до 6): ");
        Scanner sc = new Scanner(System.in);
        int taskNum = sc.nextInt();

        switch(taskNum) {
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

        }
    }
}
