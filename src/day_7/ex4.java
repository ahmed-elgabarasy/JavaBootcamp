package day_7;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = input.nextInt();

        int sum=0 ;

while (num!=0) {


    sum = sum + num;

    num = input.nextInt();

}

        System.out.println(sum);
    }
}
