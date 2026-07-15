package day_3;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println( "please enter the loan Amount :");

        double loanAmount= input.nextDouble();

        System.out.println("please enter the interest Rate :");
        double interestRate= input.nextDouble();
        System.out.println("please enter How Many Years :");
        double years= input.nextDouble();




      double  interest = loanAmount * (interestRate / 100) * years;
       double totalPayment = loanAmount + interest;
        double monthlyPayment = totalPayment / (years * 12);

        System.out.println("Interest :"+interest );
        System.out.println("total Payment :"+totalPayment);
        System.out.println("monthly Payment "+monthlyPayment );
    }
}
