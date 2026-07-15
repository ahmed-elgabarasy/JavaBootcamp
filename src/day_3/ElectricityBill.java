package day_3;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Enter units: ");

        int units= input.nextInt();
        System.out.println("Enter price per unit:");
        double price= input.nextDouble();

        double baseCost = units * price;
       double tax = baseCost * 0.05;
       double finalBill = baseCost + tax;

        System.out.println("===============================");
        System.out.println(" Electricity Bill");
        System.out.println("===============================");
        System.out.println("Units       :"+units);
        System.out.println("Base Cost   :"+baseCost);

        System.out.println("Tax   :"    +tax);
        System.out.println("Final Bill    :   "+finalBill);


    }
}
