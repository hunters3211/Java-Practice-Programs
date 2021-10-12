package Exercises;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String args[]){
        System.out.println("enter the amount in euros and current exchange rate in euros followed by the current exchange rate in usd");
        Scanner in = new Scanner(System.in);

        float euros = Float.parseFloat(in.nextLine());
        float exchangeFrom = Float.parseFloat(in.nextLine());
        float exchangeTo = Float.parseFloat(in.nextLine());
        //rounding up by penny
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        float usd = Float.valueOf(df.format((euros*exchangeFrom)/exchangeTo));
        System.out.printf("%f euros at an exchange rate of %f is %f",euros,exchangeTo,usd);

    }
}
