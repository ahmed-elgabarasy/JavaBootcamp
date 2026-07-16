package day_4;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student's degree");
        int degree = input.nextInt();

        if (degree >= 90 && degree<=100) {

            System.out.println("A");
        } else if (degree >= 80 && degree<=89) {


            System.out.println("B");

        } else if (degree >= 70&& degree<=79) {
            System.out.println("C");
        } else if (degree >= 60 && degree<=69) {
            System.out.println("D");
        } else if (degree <=59 && degree>=0 ) {


            System.out.println("F");

        } else {


            System.out.println("Invalid Degree");
        }
    }
}

