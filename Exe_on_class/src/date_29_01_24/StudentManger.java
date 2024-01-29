package date_29_01_24;

import java.util.Scanner;

public class StudentManger {
    static Scanner input = new Scanner(System.in);
    static Student[] students = new Student[100];

    static void defaulCase() {
        students[0] = new Student(1, "Abc", 15, "abc@gmail.com");
        students[1] = new Student(2, "Abcd", 16, "abcd@gmail.com");
    }

    public static void addStudent() {
        System.out.println("Enter student's id:");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Enter student's name:");
        String name = input.nextLine();

        System.out.println("Enter student's age:");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter student's email:");
        String email = input.nextLine();

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = new Student(id, name, age, email);
                break;
            }
        }
        System.out.println();
    }

    public static void editStudent() {
        System.out.println("Enter the id to choose the student you want to edit:");
        int checkId = input.nextInt();
        input.nextLine();

        for (Student s : students) {
            if (s.getId() == checkId) {
                System.out.println("Enter student's name:");
                String name = input.nextLine();

                System.out.println("Enter student's age:");
                int age = input.nextInt();
                input.nextLine();

                System.out.println("Enter student's email:");
                String email = input.nextLine();

                s.setName(name);
                s.setAge(age);
                s.setEmail(email);

                break;
            }
        }
        System.out.println();
    }

    public static void removeStudent() {
        System.out.print("Enter the id to choose the student you want to remove: ");
        int checkId = input.nextInt();
        input.nextLine();

        ac:
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == checkId) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                    if (students[j + 1] == null) break ac;
                }
            }
        }
        System.out.println();
    }

    public static void displayStudent() {
        System.out.println();
        
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            }
        }
        System.out.println();
    }

    public static void searchStudent() {
        System.out.println();

        System.out.print("Enter the name to choose the student you want to find: ");
        String name = input.nextLine();

        boolean found = false;

        for (Student s : students) {
            if (s != null && s.getName().trim().toLowerCase().equals(name.toLowerCase())) {
                System.out.println(s);
                found = true;
            }
        }

        if (found == false) System.out.println("Not found the students with that name!");

        System.out.println();
    }

    public static void searchStudentById() {
        System.out.println();

        System.out.print("Enter the ID to choose the student you want to find:");
        int id = input.nextInt();
        input.nextLine();

        boolean found = false;

        for (Student s : students) {
            if (s != null && s.getId() == id) {
                System.out.println(s);
                found = true;
                break;
            }
        }

        if (found == false) System.out.println("Not found the students with that name!");

        System.out.println();
    }
}
