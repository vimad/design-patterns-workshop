/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package composite.exercise1;

import java.util.*;

/**
 * This ContactIterator should iterate through the composite tree structure
 * without first building up a list of elements.  It thus figures out on-the-fly
 * whether there is a next element or not.
 */
public class ContactIterator implements Iterator<Contact> {
    private Contact nextContact;
    private final Deque<Iterator<Contact>> unfinishedIterators =
        new ArrayDeque<>();

    public ContactIterator(Contact contact) {
        if (contact.isLeaf()) nextContact = contact;
        else unfinishedIterators.addLast(contact.children());
    }

    public boolean hasNext() {
        if (nextContact != null) return true;
        nextContact = findNextLeaf();
        return nextContact != null;
    }

    private Contact findNextLeaf() {
        // homework - either a loop or recursively
    }

    public Contact next() {
        if (!hasNext()) throw new NoSuchElementException();
        var result = nextContact;
        nextContact = null;
        return result;
    }

    /**
     * This should throw an IllegalStateException if the root node of the
     * ContactIterator is a leaf; otherwise it should remove the element from
     * the composite tree structure.
     */
    public void remove() {
        // you can only call remove() once after a next()
        throw new UnsupportedOperationException("todo");
    }
}
