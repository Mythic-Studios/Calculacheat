package net.mars_myth.simple;



import net.mars_myth.Main;

import java.util.Scanner;

import static net.mars_myth.Main.LastNumber;
import static net.mars_myth.alternative.CalculatorInstances.*;

public class ThreeNumberSimple {

    public static Scanner getNumber1 = new Scanner(System.in);
    public static Scanner getSymbol1 = new Scanner(System.in);
    public static Scanner getNumber2 = new Scanner(System.in);
    public static Scanner getSymbol2 = new Scanner(System.in);
    public static Scanner getNumber3 = new Scanner(System.in);

    public static Scanner getEnd = new Scanner(System.in);
    public static String getEndValue;

    public static int FirstNumber;
    public static String FirstSymbol;
    public static int SecondNumber;
    public static String SecondSymbol;
    public static int ThirdNumber;
    public static int HangingNumber;
    public static int Answer;

    public static void getValues() {
        System.out.println("First Number (Doesn't Allow Decimals)");
        FirstNumber = Integer.parseInt(getNumber1.nextLine());
        System.out.println("First Symbol (Allows: " + allowedSymbols + ")");
        FirstSymbol = getSymbol1.nextLine();
        System.out.println("Second Number (Doesn't Allow Decimals)");
        SecondNumber = Integer.parseInt(getNumber2.nextLine());
        System.out.println("Second Symbol (Allows: " + allowedSymbols + ")");
        SecondSymbol = getSymbol2.nextLine();
        System.out.println("Third Number (Doesn't Allow Decimals)");
        ThirdNumber = Integer.parseInt(getNumber3.nextLine());

        StartSolving(FirstNumber, FirstSymbol, SecondNumber, SecondSymbol, ThirdNumber);
    }


    public static void StartSolving(int firstNumber, String firstSymbol, int secondNumber, String secondSymbol, int thirdNumber) {

        if (firstSymbol.equals(addition)) {
            System.out.println(spacer);
            HangingNumber = Math.addExact(firstNumber, secondNumber);

            if (secondSymbol.equals(addition)) {
                Answer = Math.addExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: "+ Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            } else if (secondSymbol.equals(subtraction)) {
                Answer = Math.subtractExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: "+ Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            } else if (secondSymbol.equals(multiplication)) {
                Answer = Math.multiplyExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: "+ Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            } else if (secondSymbol.equals(division)) {
                Answer = Math.divideExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: " + Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            }


        } else if (firstSymbol.equals(subtraction)) {
            System.out.println(spacer);
            HangingNumber = Math.subtractExact(firstNumber, secondNumber);

            if (secondSymbol.equals(addition)) {
                Answer = Math.addExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: "+ Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            } else if (secondSymbol.equals(subtraction)) {
                Answer = Math.subtractExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: "+ Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            } else if (secondSymbol.equals(multiplication)) {
                Answer = Math.multiplyExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: "+ Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            } else if (secondSymbol.equals(division)) {
                Answer = Math.divideExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: " + Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            }

        } else if (firstSymbol.equals(multiplication)) {
            System.out.println(spacer);
            HangingNumber = Math.multiplyExact(firstNumber, secondNumber);

            if (secondSymbol.equals(addition)) {
                Answer = Math.addExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: "+ Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            } else if (secondSymbol.equals(subtraction)) {
                Answer = Math.subtractExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: "+ Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            } else if (secondSymbol.equals(multiplication)) {
                Answer = Math.multiplyExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: "+ Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            } else if (secondSymbol.equals(division)) {
                Answer = Math.divideExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: " + Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            }
        } else if (firstSymbol.equals(division)) {
            System.out.println(spacer);
            HangingNumber = Math.divideExact(firstNumber, secondNumber);

            if (secondSymbol.equals(addition)) {
                Answer = Math.addExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: "+ Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            } else if (secondSymbol.equals(subtraction)) {
                Answer = Math.subtractExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: "+ Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            } else if (secondSymbol.equals(multiplication)) {
                Answer = Math.multiplyExact(HangingNumber, thirdNumber);
                System.out.println("Your answer is: " + Answer);
                System.out.println(spacer);
                System.out.println(end);
                getEndValue = getEnd.nextLine();

                if (getEndValue.equals("Yes")) {
                    Main.StartCalculator();
                    LastNumber = Answer;
                }
            }
        }


    }
}
