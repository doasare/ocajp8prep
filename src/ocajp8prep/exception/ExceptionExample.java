package ocajp8prep.exception;

public class ExceptionExample {

  public static void main(String [] args) throws Throwable{
    System.out.println("will print");
    tryCatchExample();
    throwException();
//    throw new StackOverflowError(); //wont compile
    System.out.println("wont print");
  }
  public static void throwException() throws RuntimeException{
    throw new RuntimeException();
  }
  public static void tryCatchExample() {
    try {
      System.exit(0);
    }
    finally {
      System.out.println("got here");
    }
    System.out.println("got here");

  }
}
