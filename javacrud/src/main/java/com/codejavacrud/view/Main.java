package com.codejavacrud.view;

import com.codejavacrud.controller.PersonController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonController controller = new PersonController();

        while (true) {
            System.out.println("1. Create Person");
            System.out.println("2. List People");
            System.out.println("3. Update Person");
            System.out.println("4. Delete Person");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter email: ");
                    String email = scanner.nextLine();

                    controller.createPerson(id, name, email);

                }
                case 2 -> {
                    System.out.println(controller.ListPeople());

                }

                case 3 -> {
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter email: ");
                    String email = scanner.nextLine();
                    if (controller.updatePerson(id, name, email)) {
                        System.out.println("Person updated successfully");
                    } else {
                        System.out.println("Person not found");
                    }

                }

                case 4 -> {
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    if (controller.deletePerson(id)) {
                        System.out.println("Person deleted successfully");
                    } else {
                        System.out.println("Person not found");
                    }
                }

                case 5 -> {
                    System.exit(0);
                    scanner.close();
                    return;
                }

                default -> {
                    System.out.println("Invalid choice");

                }
            }

        }

    }
}