package day_4;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("enter the age :");
        int age =input.nextInt();


        if (age>=18){

            System.out.println("The person is an adult");

        }
        else{

            System.out.println("The person not an adult");


        }

    }
}