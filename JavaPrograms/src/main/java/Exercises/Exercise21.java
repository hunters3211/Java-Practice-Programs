package Exercises;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String args[]){
        final String[] months =new  String[]{"january","february","march","april","may","june","july","august","september","october","november","december"};

        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number of the month");
        int month = in.nextInt();
        if(month>12 || month <0){
            System.out.println("illegal input");
            System.exit(0);
        }
        System.out.printf("the name of the month is %s", months[month-1]);


    }
}
