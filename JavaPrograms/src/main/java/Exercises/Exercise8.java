package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[]){
        System.out.println("how many people");
        Scanner in = new Scanner(System.in);
        int people = Integer.parseInt(in.nextLine());
        System.out.println("how many pizzas");
        int pizzas = Integer.parseInt(in.nextLine());
        System.out.println("how many slices per pizza");
        int slices = Integer.parseInt(in.nextLine());
        System.out.printf("Each person gets %d slices of pizza\nthere will be %d leftover slice(s)",(pizzas*slices)/people,(pizzas*slices)%people);

    }
}
