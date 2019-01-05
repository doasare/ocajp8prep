package ocajp8prep.operators;

public class IncrementDecrementOp {

    public static void main (String [] args){
        int n = 5;
        System.out.println(n); //5
        System.out.println(n++); //5
        System.out.println(n); // 6

        System.out.println(n); //6
        System.out.println(++n); //7
        System.out.println(n); //7
    }

    public void postfixIncrement(){
        int a = 10;
        int x = 5 * a++; // this will use value first and then increment after

        /*** 2 steps occur

         x = 5 * a
         x = a +1; {PostFix after code}

         x = 50 and a = 11
         */
    }
    public void prefixIncrement(){
        int b = 2;
        int y = 5 - ++b; // this increment first and then use value after

        /***  2 steps occur

         b = b + 1 {PrefixFix before code}
         y = 5 - b

         b = 3 and y = 2
         */

    }
}
