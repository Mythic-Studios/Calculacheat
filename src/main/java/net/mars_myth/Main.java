package net.mars_myth;

import net.mars_myth.conversion.USDollarConvert;
import net.mars_myth.simple.ThreeNumberSimple;
import net.mars_myth.simple.TwoNumberSimple;
import static net.mars_myth.alternative.MainInstances.*;
import java.util.Scanner;

public class Main {

    public static int LastNumber;

    public static void main(String[] args) {


        StartCalculator();

    }

    public static void StartCalculator() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(spacer);
        System.out.println(firstQuestion);
        System.out.println(types + " (Just type the first word)");
        System.out.println(" or type '" + infoKey + "' to view what everything does");
        System.out.println(spacer);

        String type = scanner.nextLine();

        if (type.equals(infoKey)) {

        } else if (type.equals("Simple")) {

            System.out.flush();
            System.out.println(SimpleCalculatorWelcome);
            System.out.println(SimpleCalculatorExample);
            System.out.println(spacer);
            System.out.println(SimpleCalculatorQuestion);
            String number = scanner.next();

            if (number.equals("2")) {
                TwoNumberSimple.getValues();
            } else if (number.equals("3")) {
                ThreeNumberSimple.getValues();
            }

        } else if (type.equals("Advanced")){

        } else if (type.equals("Money")){

            System.out.println(spacer);
            System.out.println(ConvertWelcome);
            System.out.println(ConvertExample);
            System.out.println(spacer);
            System.out.println(ConvertQuestion);
            String currency = scanner.next();

            if (currency.equals("USD")) {
                USDollarConvert.questioning();
            }

        } else if (type.equals("Prism")){

        }
    }


}