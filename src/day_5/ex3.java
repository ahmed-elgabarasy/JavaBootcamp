package day_5;

import java.util.Scanner;

public class ex3{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("===== MENU =====");

        System.out.println("1. add");
        System.out.println("2.Delete");
        System.out.println("3. Update");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");

        int choice=input.nextInt();




        switch (choice){
            case 1 ->  System.out.println("add");

            case 2 ->  System.out.println("Delete");

            case 3 ->  System.out.println("Update");

            case 4 ->  System.out.println("Exit");




            default-> System.out.println("Invalid Choice ");
        }







    }
}
