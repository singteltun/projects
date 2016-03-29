import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Java8Tester4 {

  public static void main(String args[]) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

    System.out.println("Print all numbers");
    eval(list, n -> true);

    System.out.println("Print even numbers");
    eval(list, n -> n % 2 == 0);

    System.out.println("Print numbers greater than 3");
    eval(list, n -> n > 3);
  }

  private static void eval(List<Integer> intList, Predicate<Integer> predicate) {
    for (Integer i : intList) {
      if (predicate.test(i)) System.out.println(i);
    }
  }

}
