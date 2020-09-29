package HomeWork3;

import java.util.HashMap;
import java.util.Map;

public class ArrayRepeatWord {

  public static void main(String[] args) {
    String[] strings = {
        "Dog", "Dog", "Dog", "Cat", "Cat", "Cat",
        "Bird", "Bird", "Bird", "Bird", "Bird", "Bird",
    };
    Map<String, Integer> hm = new HashMap<>();
    for (int i = 0; i < strings.length; i++) {
      Integer count = hm.getOrDefault(strings[i], 0);
      hm.put(strings[i], count + 1);
    }
    System.out.println(hm);
  }

}
