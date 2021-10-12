package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[]) {

        final int legalAge = 16;

        Scanner in = new Scanner(System.in);
        System.out.println("how old are you");
        int age = Integer.parseInt(in.nextLine());

        if(age>=legalAge){
            System.out.println("you can legally drive");
        }
        else{
            System.out.println("you can not legally drive");
        }
    }
}
