package playground.decorator;

import java.util.stream.*;

public class MyCollections {
    public static <E> ImmutableCollection<E> immutable(MutableCollection<E> collection) {
        return new ImmutableCollection<E>() {
            @Override
            public boolean isEmpty() {
                return collection.isEmpty();
            }

            @Override
            public int size() {
                return collection.size();
            }

            @Override
            public Stream<E> stream() {
                return collection.stream();
            }

            @Override
            public String toString() {
                return collection.toString();
            }
        };

    }
}
