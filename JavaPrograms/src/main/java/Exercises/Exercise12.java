package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[]){
        System.out.println("enter the principal");
        Scanner in = new Scanner(System.in);
        float principal = Float.parseFloat(in.nextLine());
        System.out.println("enter interest rate");
        float rate = Float.parseFloat(in.nextLine())/100;
        System.out.println("enter years");
        float years = Float.parseFloat(in.nextLine());

        float A = (float) Math.ceil(principal*(1+(rate*years)));

        System.out.printf("after %f years at %.1f%%, the investment will be worth $%.2f",years,rate*100,A);
    }
}
