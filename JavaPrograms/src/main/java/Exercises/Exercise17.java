package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your oz of alc consumed, body weight in pounds, gender (1 for male 2 for female), and hours since last drink in that order");
        float A = Float.parseFloat(in.nextLine());
        int W = Integer.parseInt(in.nextLine());
        int gender = Integer.parseInt(in.nextLine());
        int H = Integer.parseInt(in.nextLine());

        if(gender==1){
            float BAC = (float) ((A*5.14)/(W*0.73)-(0.015*H));
            if(BAC>=0.08){
                System.out.printf("BAC is %f illegal to drive\n",BAC);
            }
            else{
                System.out.println("legal to drive");
            }
        }
        else{
            float BAC = (float) ((A*5.14)/(W*0.66)-(0.015*H));
            if(BAC>=0.08){
                System.out.printf("BAC is %f illegal to drive\n",BAC);
            }
            else{
                System.out.println("legal to drive");
            }
        }
    }
}
