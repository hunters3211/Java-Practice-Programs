package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[]){
        System.out.println("what was the quote");
        Scanner in = new Scanner(System.in);
        String quote = in.nextLine();
        System.out.println("who said it");
        in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.printf("%s says, \"%s\"",name,quote);
    }
}
