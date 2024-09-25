package playground.decorator;

import java.util.stream.*;

public interface ImmutableCollection<E> {
    boolean isEmpty();
    int size();
    Stream<E> stream();
}
