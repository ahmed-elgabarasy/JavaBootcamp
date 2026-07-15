package day_3;

import java.util.Scanner;

public class TimeConverter{
public static void main(String[] args) {

    Scanner input=new Scanner(System.in);

    System.out.println("Enter seconds:");
int totalSeconds=input.nextInt();
    int hours=0;
    hours = totalSeconds / 3600;

int remainingSeconds= totalSeconds % 3600;

int minutes= remainingSeconds/60 ;

    int seconds = remainingSeconds % 60 ;


    System.out.println("Houres :"+hours);
    System.out.println("Minutes :"+minutes);
    System.out.println("Seconds :"+seconds);
}
}
