package day_3;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);


        System.out.println("enter your Name");
        String name=input.nextLine();

        System.out.println("enter your Account namber");
        int account_number=input.nextInt();

        System.out.println("enter your current balance");
        double current_balance=input.nextDouble();

        System.out.println("enter your deposit ");
        double deposit_Amount=input.nextDouble();

        System.out.println("enter your withdrawal");
        double withdrawal_amount=input.nextDouble();


       double newBalance = current_balance + deposit_Amount - withdrawal_amount;


        System.out.println("=========================");
        System.out.println(" BANK ACCOUNT");
        System.out.println("=========================");

        System.out.println("Customer :"+name);
        System.out.println("Account  :"+account_number);
        System.out.println("Balance  :"+current_balance);
        System.out.println("Deposit  :"+deposit_Amount);
        System.out.println("Withdraw  :"+withdrawal_amount);
        System.out.println("--------------------------");
        System.out.println("New Balance  :"+newBalance);
        System.out.println("=========================");


    }
}
