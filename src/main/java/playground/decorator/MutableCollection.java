package playground.decorator;

public interface MutableCollection<E> extends ImmutableCollection<E> {
    boolean add(E e);

    boolean remove(E e);

    void clear();
}
