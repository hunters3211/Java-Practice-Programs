package Exercises;

import java.util.Calendar;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String args[]){
        System.out.println("What is your current age");
        Scanner in = new Scanner(System.in);
        int curAge = Integer.parseInt(in.nextLine());
        System.out.println("At what age would you like to retire");
        in = new Scanner(System.in);
        int retAge = Integer.parseInt(in.nextLine());
        System.out.printf("you have %d years left until you can retire\n",retAge-curAge);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.printf("it is %d, so you can retire in %d",year,year+(retAge-curAge));
    }
}
