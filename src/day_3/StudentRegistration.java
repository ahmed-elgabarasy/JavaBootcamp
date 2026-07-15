package day_3;

import java.util.Scanner;

public class StudentRegistration {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("please enter your Name:" );
        String Name=input.nextLine();
        System.out.println("please enter your Age:" );
        int Age= input.nextInt();
        System.out.println("please enter your Height :" );
        double Height=input.nextDouble();

        System.out.println("please enter your Weight : ");
        double Weight=input.nextDouble();
        input.nextLine();
        System.out.println("please enter your Major: ");
        String Major= input.nextLine();
        System.out.println("please enter your University:" );
        String University= input.nextLine();

        int Birth_Year= 2026-Age ;
        double BMI = 0;
        BMI = Weight / (Height * Height);

        System.out.println("==================================");
        System.out.println("STUDENT PROFILE");
        System.out.println("==================================");
        System.out.println("Name        :"+Name);
        System.out.println("Age         : "+Age);
        System.out.println("Birth Year  :"+Birth_Year);
        System.out.println("University  :"+University);
        System.out.println("Major       :"+Major);
        System.out.println("Height      :"+Height);
        System.out.println("Weight      :"+Weight);
        System.out.println("BMI         :"+BMI);
        System.out.println("==================================");



    }

}