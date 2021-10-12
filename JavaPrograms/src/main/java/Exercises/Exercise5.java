package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[] ){
        System.out.println("what is the first number");
        Scanner in = new Scanner(System.in);
        float number1 = Float.parseFloat(in.nextLine());
        System.out.println("what is the second number");
        float number2 = Float.parseFloat(in.nextLine());
        System.out.printf("%f+%f = %f\n%f-%f = %f\n%f*%f = %f\n%f/%f = %f",number1,number2,number1+number2,number1,number2,number1-number2,number1,number2,number1*number2,number1,number2,number1/number2);
    }
}
