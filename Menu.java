package site.um.javajiraya.javacore.Gassociacao.ExSeminarios;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    public Aluno[] studentList;

    public void menuStudant(){
        System.out.println("Menu - Student\n");
        System.out.println("1 - Search a seminar by subject");
        System.out.println("2 - Search a seminar by location");
        System.out.println("3 - Sing up a seminar");
        System.out.println("0 - exit");
    }

    public void menuProfessor(){
        System.out.println("1 - ");
        System.out.println("0 - exit");
    }

    public void menuInicail(){
        System.out.println("Menu - Seminars\n");
        System.out.println("1 - Student");
        System.out.println("2 - Professor");
        System.out.println("0 - Exit");
        System.out.println("You are a: ");
        String typeUser = input.next();
        menuVer(typeUser);
    }

    public void menuVer(String typeUser){
        if (typeUser.equals("1") || typeUser.equals("2")){
            String op;

            if (typeUser.equals("1")){
                do {
                    System.out.println("1 - Login");
                    System.out.println("2 - Register");

                    op = input.next();

                    if (op.equals("1") || op.equals("2")){
                        if (op.equals("1")){
                            System.out.print("Type your name: ");
                            String name = input.nextLine();
                            System.out.print("Type your age: ");
                            input.nextInt();

                            System.out.print("Last, type your ID: ");
                            int id = input.nextInt();

                            for (Aluno student : studentList){
                                if (student.getId() == id){
                                    //pause 11/18
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("Please type a number that match with one of the options!");
                    }
                }while (!op.equals("0"));

                menuStudant();
            }
            else{
                menuProfessor();
            }
        }
        else if (typeUser.equals("0")) {
            return;
        }
        else{
            System.out.println("Please type a number that match with one of the options!");
            menuInicail();
        }
    }
}
