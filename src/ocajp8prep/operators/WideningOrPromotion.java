package ocajp8prep.operators;

public class WideningOrPromotion {
    public static void main (String [] args){
        double result1 = 9/2; // int value are promoted to double
        //operand is evaluated then converted to double ans = 4.0

        double result2 = 9.0/2; // operand promotes int then converts to double
        // after conversion then evaluated. ans = 4.5

        System.out.println(result1);
        System.out.println(result2);

    }

}
