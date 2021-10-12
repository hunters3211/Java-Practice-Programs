package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[]){
        final String password = "123abcd";
        Scanner in = new Scanner(System.in);
        System.out.println("what is the password");
        String attempt = in.nextLine();

        if(attempt.equals(password)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you");
        }


    }
}
