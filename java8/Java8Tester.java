import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Java8Tester {

  public static void main(String args[]) {
    List<String> names1 = new ArrayList<String>();
    names1.add("bbbb");
    names1.add("cccc");
    names1.add("aa");

    System.out.println("Before : " + names1);

    Java8Tester tester = new Java8Tester();
    tester.sortUsingJava8(names1);
    
    System.out.println("After : " + names1);
  }

  private void sortUsingJava8(List<String> nameList) {
    Collections.sort(nameList, (s1, s2) -> s1.compareTo(s2));
  }
}

