package site.um.javajiraya.javacore.Gassociacao.ExSeminarios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        Menu menu = new Menu();

        menu.menuHome();

        if (menu.menuVer().equals("1")){
            String op;
            do {
                System.out.println("\n1 - Register");
                System.out.println("2 - Login");
                System.out.print("Choose an option: ");
                op = input.next();

                if (op.equals("1") || op.equals("2")){
                    if (op.equals("1")){
                        System.out.print("Type your name: ");
                        input.nextLine();
                        String name = input.nextLine();
                        System.out.print("Type your age: ");
                        int age = input.nextInt();

                        System.out.print("Last, type your SSN: ");
                        int ssn = input.nextInt();

                        if (existenceVerStudent(ssn, studentList)){
                            Student student = new Student(name, age, ssn);
                            studentList.add(student);
                            System.out.println("User successfully registered.");
                        }
                        else {
                            System.out.println("This ssn it's already registered.");
                        }
                    }
                }
                else {
                    System.out.println("Please type a number that match with one of the options!");
                }
            }while (!op.equals("0"));

            menu.menuStudent();
        }
        else{
            menu.menuProfessor();
        }
    }


    // That func return false in case of the student ssn its already registered
    public static boolean existenceVerStudent(int ssn, List<Student> studentList){
        for (Student student : studentList) {
            if (student.getSsn() == ssn){
                return false;
            }
        }
        return true;
    }
}
