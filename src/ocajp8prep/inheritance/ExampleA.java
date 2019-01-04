package ocajp8prep.inheritance;

public class ExampleA {
    public int i = 4;

    public void printInteger(){
        System.out.println("ExampleA print integer "+i);
    }
    public static void main(String [] args){
        ExampleA a = new ExampleB();
        a.printInteger();
        System.out.println(a.i);


    }


}
