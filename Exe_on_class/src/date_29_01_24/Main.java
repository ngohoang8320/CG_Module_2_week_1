package date_29_01_24;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        StudentManger.defaulCase();

        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Edit student");
            System.out.println("3. Remove student");
            System.out.println("4. Display student list");
            System.out.println("5. Search student by name");
            System.out.println("6. Search student by id");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    StudentManger.addStudent();
                    break;

                case 2:
                    StudentManger.editStudent();
                    break;

                case 3:
                    StudentManger.removeStudent();
                    break;

                case 4:
                    StudentManger.displayStudent();
                    break;

                case 5:
                    StudentManger.searchStudent();
                    break;

                case 6:
                    StudentManger.searchStudentById();
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }

}
