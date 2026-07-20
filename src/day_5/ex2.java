package day_5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter The letter of appreciation");

        char letter =input.next().charAt(0);


        switch (letter){
            case 'A' ->  System.out.println("Excellent");

            case 'B' ->  System.out.println("Very Good");

            case 'C' ->  System.out.println("Good");

            case 'D' ->  System.out.println("Pass");

            case 'F'->  System.out.println("Fail");



            default-> System.out.println("Invalid Grade ");
        }







    }
}
