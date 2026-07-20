package day_7;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number: ");

        int num = input.nextInt();

while (num<=0){

    System.out.println("Invalid number! Please enter a positive number:");

    num = input.nextInt();
}

        System.out.println("Valid Number: "+ num);





    }
}