package ocajp8prep.inheritance;

public class ExampleB extends ExampleA{
    public int i = 2;

    @Override
    public void printInteger(){
        System.out.println("ExampleB print integer "+i);
    }
}
