package ocajp8prep.blocks;

public class StaticBlock {
  static {
    try {
      throwException();
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("did crashed?");
  }
  public static void main (String [] args) throws Exception{
    System.out.println("continue");
  }
  public static void throwException() {
    throw new RuntimeException();
  }
}
