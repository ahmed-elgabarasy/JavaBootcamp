package day_7;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num=input.nextInt();
 int i=1;


        while (i<=10){



            System.out.println(num+"*"+i+"="+(num*i));
            i++;

        }


    }
}
