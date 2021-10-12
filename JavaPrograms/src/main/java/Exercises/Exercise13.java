package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[]){
        System.out.println("what is the principal");
        Scanner in = new Scanner(System.in);
        float principal = Float.parseFloat(in.nextLine());
        System.out.println("what is the rate");
        float rate = Float.parseFloat(in.nextLine());
        System.out.println("how many years");
        float years = Float.parseFloat(in.nextLine());
        System.out.printf("how many times compounded per year");
        int compound = Integer.parseInt(in.nextLine());

        float A = (float) Math.ceil(Math.pow(principal*(1+(rate/compound)),(years*compound)));

        System.out.printf("%.2f invested after %f years at %.1f%% compouned %d times will be worth $%.2f",principal,rate*100,years,compound,A);

    }
}
