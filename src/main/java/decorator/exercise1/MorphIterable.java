/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package decorator.exercise1;

import java.util.*;

/**
 * This class should implement Iterable<B>.  The remove() method should remove
 * the item from the input Iterable.
 */
public class MorphIterable<A, B> implements Iterable<B>{
    private final Iterable<A> input;
    private final Morpher<A, B> morpher;

    public MorphIterable(Iterable<A> input, Morpher<A, B> morpher) {
        this.input = input;
        this.morpher = morpher;
    }

    public interface Morpher<A, B> {
        B morph(A a);
    }

    @Override
    public Iterator<B> iterator() {
        var iterator = input.iterator();
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public B next() {
                return morpher.morph(iterator.next());
            }

            @Override
            public void remove() {
                iterator.remove();
            }
        };
    }
}

