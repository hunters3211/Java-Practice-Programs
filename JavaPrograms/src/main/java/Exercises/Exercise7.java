package Exercises;

import java.util.Scanner;

public class App {
final double conversion = .09290304;

    public static void main(String args[]){

        final double conversion = .09290304;

        System.out.println("what is the length of the room in ft");
        Scanner in = new Scanner(System.in);
        int length = Integer.parseInt(in.nextLine());
        System.out.println("what is the width in ft");
        int width = Integer.parseInt(in.nextLine());
        int areaI = width*length;
        double areaM = areaI*conversion;
        System.out.printf("The area is\n%d square feet\n%f square meters",areaI,areaM);
    }
}
