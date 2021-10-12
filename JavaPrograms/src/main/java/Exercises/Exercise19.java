package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter height in inches and weight in pound");
        float height = in.nextFloat();
        float weight = in.nextFloat();
        float bmi = (weight/(height*weight))*703;

        System.out.printf("your bmi is %.01f\n",bmi);

        if(bmi>25){
            System.out.printf("lose some weight\n");
        }
        else if(bmi<18){
            System.out.println("gain some weight\n");
        }
        else{
            System.out.println("normal weight");
        }

    }
}
