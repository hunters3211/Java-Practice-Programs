package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("What is the input string");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int length = word.length();
        System.out.printf("%s has length %d",word,length);
    }
}
