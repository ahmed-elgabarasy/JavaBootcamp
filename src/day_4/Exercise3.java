package day_4;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);

        System.out.println("enter your Username");

        String Username = input.nextLine();

        System.out.println("enter your Password");

        int Password =input.nextInt();

if (Username.equals("admin")&& Password==1234 ){
            System.out.println("Login Successful");


        }
else {

            System.out.println("Invalid Username or Password");

        }
    }
}
