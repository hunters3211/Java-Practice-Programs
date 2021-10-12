package Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("what is the order amount");
        float order = Float.parseFloat(in.nextLine());
        System.out.println("what is the state");
        String state = in.nextLine();
        System.out.println("what is the county");
        String county = in.nextLine();

        DecimalFormat df = new DecimalFormat("0.00");
        if (state.equals("Wisconsin")) {
            if (county.equals("Eau Claire")) {
                System.out.printf("the tax is %s\n", df.format(order * 0.0505));
                order = (float) (order * 0.0505) + order;
            } else if (county.equals("Dunn")) {
                System.out.printf("the tax is %s\n", df.format(order * 0.0504));
                order = (float) (order * 0.0504) + order;
            } else {
                System.out.printf("the tax is %s\n", df.format(order * 0.05));
                order = (float) (order * 0.05) + order;
            }
        } else if (state.equals("Illinois")) {
            System.out.printf("the tax is %s\n", df.format(order * 0.08));
            order = (float) (order * 0.08) + order;
        }
        System.out.printf("The total is %.02f", order);

    }
}
