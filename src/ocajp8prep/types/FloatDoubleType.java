package ocajp8prep.types;

import java.util.Scanner;

public class FloatDoubleType {
    //Default double 0.0 / 0.0d
    //Default float 0.0f / 0f


    /**
     * float is used to save memory e.g. large arrays
     * double is default choice for double values
     *
     * shouldnt use double or float for precise values
    */

    //floating point numbers can be divided by 0
    public static void main (String [] args){
        double d = 4.5/0.0; //Infinity
        double d1 = 0d / 0d; //NaN
        double d2 = d/d; //NaN
        scanner();
    }
    public static void scanner(){
        float number2;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Double: ");
            double number1 = input.nextDouble();
            System.out.println("Float: ");
            number2 = input.nextFloat();
        }
        System.out.printf("original: %f%n"+ number2 );

    }
}
