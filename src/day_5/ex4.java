package day_5;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter operator:");

        char operator =input.next().charAt(0);

        System.out.println("Enter first number:");
        int num1=input.nextInt();

        System.out.println("Enter Second number:");
        int num2=input.nextInt();

        if (num2==0 && operator == '/'){

            System.out.println("Cannot divide by zero.");

        }
else {

            switch (operator) {
                case '+' -> System.out.println("Output: " + (num1 + num2));

                case '-' -> System.out.println("Output: " + (num1 - num2));

                case '*' -> System.out.println("Output: " + (num1 * num2));

                case '/' -> System.out.println("Output: " + (num1 / num2));
                default -> System.out.println("Invalid operator");

            }
        }
    }
}