package ocajp8prep.array;

public class ArrayExercise {
    static String [] strings;

    public static void main (String [] args) throws NullPointerException{
//        System.out.println(args[0]); index will be out of bounds
//        System.out.println(numbers[0]); will be nullpointerexception
        System.out.println(strings); // this will be null as not initialised
        strings = new String[3];

        nullpointerCheck();
        System.out.println("completed");

    }
    public static void nullpointerCheck(){
        for (String s : strings){
            System.out.println(s); // prints null 3 times
            s.concat("s"); //will be nullpointerexception
        }
    }
}
