package Exercises;


import java.util.Scanner;

public class App {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("input 3 integers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if(num1==num2 && num2==num3){
            System.out.println("all equal");
            System.exit(0);
        }

        if(num1>=num2 || num3>=num2){
            if(num1>num3){
                System.out.printf("biggest num is %d", num1);
            }
            else{
                System.out.printf("biggest num is %d",num3);
            }
        }
        else if(num2>=num1 && num2>=num3){
            System.out.printf("biggest num is %d",num2);
        }

    }
}
