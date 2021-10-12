package Exercises;

import java.util.Scanner;

public class App {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("is the car silent when you turn the key");
        String temp = in.nextLine();
        if(temp.equals("no")){
            System.out.println("does the car make a slicking noise");
            temp = in.nextLine();
            if(temp.equals("yes")){
                System.out.println("replace battery");
            }
            else{
                System.out.println("does the car crank but not start");
                temp = in.nextLine();
                if(temp.equals("yes")){
                    System.out.println("check spark plugs");
                }
                else{
                    System.out.println("does the engine start then die?");
                    temp = in.nextLine();
                    if(temp.equals("yes")){
                        System.out.println("does your car have fuel injection");
                        temp = in.nextLine();
                        if(temp.equals("yes")){
                            System.out.println("get in for service");
                        }
                        else{
                            System.out.println("ensure choke is opening and closing");
                        }
                    }
                    else{
                        System.out.println("this should not be possible");
                    }
                }
            }
        }
        else{
            System.out.println("are the battery terminals corroded");
            temp = in.nextLine();
            if(temp.equals("yes")){
                System.out.println("clean terminals and try again");
            }
            else{
                System.out.println("replace cables and try again");
            }
        }
    }
}
