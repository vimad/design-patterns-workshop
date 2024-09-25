package playground.decorator;

import java.util.*;

public class Demo {
    public static void main(String... args) {
        var list = new MyArrayList<>();
        list.add("DB");
        list.add("HK");
        list.add("BT");
        System.out.println("list = " + list);
        var list2 = new ArrayList<>();
        list2.add("BT");
        list2.add("HK");
        list2.add("DB");
        System.out.println("list2 = " + list2);
        var immutableList = MyCollections.immutableViaProxy(list);
        System.out.println("immutableList = " + immutableList);

        var immutableList2 = MyCollections.immutableViaProxy(list2);
        System.out.println("immutableList2 = " + immutableList2);
        ((MutableCollection<?>)immutableList2).clear();
    }
}
