package com.employee.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Perform {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<StudentCrud> a = new CopyOnWriteArrayList();
        System.out.println("How Many Student Do You Want To Add");
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " Id");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter " + (i + 1) + " Name");
            String name = br.readLine();
            StudentCrud sc = new StudentCrud();
            sc.setId(id);
            sc.setName(name);
            a.add(sc);
        }
        String text;
        do {
            System.out.println("Press 1 for Finding By Id");
            System.out.println("Press 2 for Update");
            System.out.println("Press 3 for Show All Data");
            System.out.println("Press 4 for Delete");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter Id For Finding");
                    int next = Integer.parseInt(br.readLine());
                    for (StudentCrud student : a) {
                        if (student.getId() == next) {
                            System.out.println(student);

                        } else {
                            throw new RuntimeException("Put Correct Id");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter id for Update");
                    int nextint = Integer.parseInt(br.readLine());
                    for (StudentCrud student : a) {
                        if (student.getId() == nextint) {
                            System.out.println("enter new name");
                            String st = br.readLine();
                            student.setName(st);
                        } else {
                            throw new RuntimeException("Put Correct Id");
                        }
                    }
                    break;
                case 3:
                    for (StudentCrud student : a) {
                        System.out.println(student);
                    }
                    break;
                case 4:
                    System.out.println("Enter Id For delete");
                    int next2 = Integer.parseInt(br.readLine());
                    for (StudentCrud student : a) {
                        if (student.getId() == next2) {
                            a.remove(student);
                            System.out.println("delete successfully");
                        } else {
                            throw new RuntimeException("Put Correct Id");
                        }
                    }

                    break;
                default:
                    System.out.println("wrong field");
            }
            System.out.println("do u want to continue ?y/n");
            text = br.readLine();

        } while (text.equalsIgnoreCase("y"));
        System.out.println("Thanks");

    }

}

