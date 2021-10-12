package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("press C to convert to Celsius and F to convert to fahrenheit");
        char selection = Character.toUpperCase(in.next().charAt(0));
        System.out.printf("your choice %c\n",selection);
        System.out.println("input starting temp");
        int temp = in.nextInt();

        if(selection == 'C'){
            float c = (temp-32)*((float)5/9);
            System.out.printf("temp C = %.02f\n",c );
        }
        else{
            float f = (temp*((float)9/5))+32;
            System.out.printf("temp F = %.02f",f);
        }
    }
}
