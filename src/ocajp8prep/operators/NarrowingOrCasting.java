package ocajp8prep.operators;

public class NarrowingOrCasting {
    // explicit is required to narrowing
    public static void main(String[] args) {
        long l = 100l;
        int i = (int) l;
        long l1 = 3000000000l;
        int i1 = (int) l1; // this is greater than int capacity and will compile
        // but result to inaccurate result;
    }
}
