package playground.decorator;

import java.util.*;
import java.util.stream.*;

public class MyArrayList<E> implements MutableCollection<E> {
    private final Collection<E> elements = new ArrayList<>();

    @Override
    public boolean add(E e) {
        return elements.add(e);
    }

    @Override
    public boolean remove(E e) {
        return elements.remove(e);
    }

    @Override
    public void clear() {
        elements.clear();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public Stream<E> stream() {
        return elements.stream();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyArrayList<?> that = (MyArrayList<?>) o;
        return elements.equals(that.elements);
    }

    @Override
    public int hashCode() {
        return elements.hashCode();
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
