package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[]){
        System.out.println("enter a noun:");
        Scanner in = new Scanner(System.in);
        String noun = in.nextLine();
        System.out.println("verb:");
        in = new Scanner(System.in);
        String verb = in.nextLine();
        System.out.println("adjective:");
        in = new Scanner(System.in);
        String adjective = in.nextLine();
        System.out.println("adverb:");
        in = new Scanner(System.in);
        String adverb = in.nextLine();
        System.out.printf("Do you %s your %s %s %s?",verb,adjective,noun,adverb);

    }
}
