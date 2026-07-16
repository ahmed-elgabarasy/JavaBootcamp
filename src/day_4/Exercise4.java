package day_4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        double balance =543455;

        System.out.println("enter your PIN");
int pin =input.nextInt();

if (pin== 1234){

    System.out.println("Your Balance :"+balance );

    System.out.println("Enter the Withdrawal amount");

    double withdrawal= input.nextDouble();
    double newBalance= balance-withdrawal;

    if (withdrawal<=balance){

        System.out.println("your new balance is  "+newBalance);
    }





}

else {

    System.out.println("Incorrect PIN");
}


    }
}
