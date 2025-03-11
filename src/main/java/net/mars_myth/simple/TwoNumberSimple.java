package net.mars_myth.simple;



import net.mars_myth.Main;

import java.util.Scanner;

import static net.mars_myth.alternative.CalculatorInstances.*;

public class TwoNumberSimple {

    public static Scanner getNumber1 = new Scanner(System.in);
    public static Scanner getSymbol1 = new Scanner(System.in);
    public static Scanner getNumber2 = new Scanner(System.in);

    public static Scanner getEnd = new Scanner(System.in);
    public static String getEndValue;

    public static int FirstNumber;
    public static String FirstSymbol;
    public static int SecondNumber;
    public static int Answer;

    public static void getValues() {
        System.out.println("First Number (Doesn't Allow Decimals)");
        FirstNumber = Integer.parseInt(getNumber1.nextLine());
        System.out.println("First Symbol (Allows: "+ allowedSymbols + ")");
        FirstSymbol = getSymbol1.nextLine();
        System.out.println("Second Number (Doesn't Allow Decimals)");
        SecondNumber = Integer.parseInt(getNumber2.nextLine());

        StartSolving(FirstNumber, FirstSymbol, SecondNumber);
    }


    public static void StartSolving(int firstNumber, String firstSymbol, int secondNumber) {

        if (firstSymbol.equals(addition)) {
            System.out.println(spacer);
            Answer = Math.addExact(firstNumber, secondNumber);
            System.out.println("Your answer is: "+ Answer);
            System.out.println(spacer);
            System.out.println(end);
            getEndValue = getEnd.nextLine();

            if (getEndValue.equals("Yes")) {
                Main.StartCalculator();
            }
        } else if (firstSymbol.equals(subtraction)) {
            System.out.println(spacer);
            Answer = Math.subtractExact(firstNumber, secondNumber);
            System.out.println("Your answer is: "+ Answer);
            System.out.println(spacer);
            System.out.println(end);
            getEndValue = getEnd.nextLine();

            if (getEndValue.equals("Yes")) {
                Main.StartCalculator();
            }
        } else if (firstSymbol.equals(multiplication)) {
            System.out.println(spacer);
            Answer = Math.multiplyExact(firstNumber, secondNumber);
            System.out.println("Your answer is: "+ Answer);
            System.out.println(spacer);
            System.out.println(end);
            getEndValue = getEnd.nextLine();

            if (getEndValue.equals("Yes")) {
                Main.StartCalculator();
            }
        } else if (firstSymbol.equals(division)) {
            System.out.println(spacer);
            Answer = Math.divideExact(firstNumber, secondNumber);
            System.out.println("Your answer is: "+ Answer);
            System.out.println(spacer);
            System.out.println(end);
            getEndValue = getEnd.nextLine();

            if (getEndValue.equals("Yes")) {
                Main.StartCalculator();
            }
        }


    }
}
