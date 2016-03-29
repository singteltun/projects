import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Java8Tester3 {

  public static void main(String args[]) {
    List<String> list = new ArrayList<String>();

    list.add("BBB");
    list.add("ABB");
    list.add("BAB");
    list.add("BBC");
    
    Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
        
    list.forEach(System.out::println);
  }

}
