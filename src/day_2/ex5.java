package day_2;

import java.util.Scanner;

public class ex5{


    public static void main(String[] args) {

       Scanner input =new Scanner(System.in);

        System.out.println("what's your name?");
        String name=input.nextLine();
        System.out.println("what's your age?");
        int age=input.nextInt();
        System.out.println("what's your height?");
        double height=input.nextDouble();
        System.out.println("what's your major?");
        String major=input.nextLine();

        System.out.println("================================");
        System.out.println("student Information");
        System.out.println("================================");

        System.out.println("Name : "+name);

        System.out.println("Age : "+age);
        System.out.println("Height : "+height);
        System.out.println("Major : "+ major);
        System.out.println("================================");

    }
}
