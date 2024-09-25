package playground.decorator;

public class Demo {
    public static void main(String... args) {
        var list = new MyArrayList<>();
        list.add("DB");
        list.add("HK");
        list.add("BT");
        System.out.println("list = " + list);
        var immutableList = MyCollections.immutable(list);
        System.out.println("immutableList = " + immutableList);
        ((MutableCollection<?>)immutableList).clear();
    }
}
