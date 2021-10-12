package Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("what is the order amount");
        float order = Float.parseFloat(in.nextLine());
        System.out.println("what is the state");
        String state = in.nextLine();
        DecimalFormat df = new DecimalFormat("0.00");
        if(state.equals("WI")){
            System.out.printf("subtotal is %s\n the tax is %s\n", df.format(order), df.format(order*0.055));
            order = (float) (order*0.055)+order;
        }
        System.out.printf("The total is %.02f",order);
    }
}
