/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package defaultvisitor.demo.c_defaultvisitor.client;

import defaultvisitor.demo.c_defaultvisitor.framework.Number;
import defaultvisitor.demo.c_defaultvisitor.framework.Plus;
import defaultvisitor.demo.c_defaultvisitor.framework.Visitor;

import java.util.*;

public class EvalVisitor implements Visitor {
    private final Deque<Integer> stack = new ArrayDeque<>();

    protected int pop() {
        return stack.pop();
    }

    protected void push(int value) {
        stack.push(value);
    }

    public void visitPlus(Plus p) {
        if (stack.size() < 2)
            throw new IllegalStateException("Stack contains less than two values: " + stack);
        stack.push(stack.pop() + stack.pop());
    }

    public void visitNumber(Number n) {
        stack.push(n.getValue());
    }


    public int getValue() {
        if (stack.size() != 1)
            throw new IllegalStateException("Stack does not contain a single value: " + stack);
        return stack.getFirst();
    }
}
