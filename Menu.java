package site.um.javajiraya.javacore.Gassociacao.ExSeminarios;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    public void menuStudent(){
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

    public void menuHome(){
        System.out.println("Menu - Seminars\n");
        System.out.println("1 - Student");
        System.out.println("2 - Professor");
        System.out.println("0 - Exit");
        System.out.print("You are a: ");
    }

    public String menuVer(){
        String typeUser = input.next();

        if (typeUser.equals("1") || typeUser.equals("2")){
            String op;
            return typeUser;
        }
        else if (typeUser.equals("0")) {
            System.exit(0);
            return "";
        }
        else{
            System.out.println("Please type a number that match with one of the options!");
            menuHome();
            return menuVer();
        }
    }
}
