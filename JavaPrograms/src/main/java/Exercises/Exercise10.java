package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[]){
        System.out.println("enter price of item 1 then the quantity");
        Scanner in = new Scanner(System.in);
        int item1 = Integer.parseInt(in.nextLine());
        int quantity1 = Integer.parseInt(in.nextLine());
        System.out.println("enter price and quantity of item 2");
        int item2 = Integer.parseInt(in.nextLine());
        int quantity2 = Integer.parseInt(in.nextLine());
        System.out.println("enter price and quantity of item 3");
        int item3 = Integer.parseInt(in.nextLine());
        int quantity3 = Integer.parseInt(in.nextLine());

        float subtotal = (item1*quantity1)+(item2*quantity2)+(item3*quantity3);
        double total = (subtotal*0.055)+subtotal;
        double tax = subtotal*0.055;

        System.out.printf("subtotal %.2f\ntax %.2f\ntotal %.2f",subtotal,tax,total);


    }
}
