import java.lang.*;
public class NumericLiteral {
  public static void main(String args[]) {
    int x = Integer.parseInt("1100110", 2);
    System.out.println("Old x : " + x);

    x = 0b1100110;
    System.out.println("New x : " + x);

    System.out.println("==========");
    
    long anotherLong = 100_000_000L;
    int bitInt = 0b100_000_000;
    System.out.println("Long : " + anotherLong);
    System.out.println("BitInt : " + bitInt);
  }
}
