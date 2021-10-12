package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[]){
        System.out.println("enter length");
        Scanner in = new Scanner(System.in);
        int length = Integer.parseInt(in.nextLine());
        System.out.println("enter width");
        int width = Integer.parseInt(in.nextLine());
        int size = length*width;
        int gallons = (int) Math.ceil((length * width) / 350);
        System.out.printf("you will need to purchase %d gallons of paint to cover %d square feet",gallons,size);
    }
}
