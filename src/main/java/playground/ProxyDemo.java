package playground;

import java.util.*;

public class ProxyDemo {
    public static void main(String... args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3, 1, 4, 1, 5, 9);
        System.out.println("list = " + list);
        list = Collections.unmodifiableList(list);
        System.out.println("list = " + list);
        Collections.addAll(list, 3, 1, 4, 1, 5, 9); // won't work
        System.out.println("list = " + list);
    }
}
