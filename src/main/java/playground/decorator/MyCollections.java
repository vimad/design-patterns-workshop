package playground.decorator;

import eu.javaspecialists.books.dynamicproxies.Proxies;

import java.util.*;
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

            @Override
            public void printAll() {
                collection.printAll();
            }
        };

    }
    public static <E> ImmutableCollection<E> immutableViaProxy(MutableCollection<E> collection) {
        return Proxies.filter(ImmutableCollection.class, collection);
    }
    public static <E> ImmutableCollection<E> immutableViaProxy(Collection<E> collection) {
        return Proxies.filter(ImmutableCollection.class, collection);
    }
}
