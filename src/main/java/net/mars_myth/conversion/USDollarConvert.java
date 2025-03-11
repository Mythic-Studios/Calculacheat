package net.mars_myth.conversion;

public class USDollarConvert {
    public static String Answer;

    public static void questioning() {

        System.out.println("");

    }


    public static void convert(String whatCurrency, int howMany) {

        if (whatCurrency.equals("USD")) {
            Answer = String.valueOf(Math.multiplyExact(1, howMany));
        }
    }
}
