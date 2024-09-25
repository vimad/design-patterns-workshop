/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package defaultvisitor.demo.b_originalvisitorwithminus.client;

import defaultvisitor.demo.b_originalvisitorwithminus.framework.Minus;
import defaultvisitor.demo.b_originalvisitorwithminus.framework.Number;
import defaultvisitor.demo.b_originalvisitorwithminus.framework.Plus;
import defaultvisitor.demo.b_originalvisitorwithminus.framework.Visitor;

import java.util.concurrent.atomic.*;

public class NumberCountVisitor implements Visitor {
    private final LongAdder count = new LongAdder();

    public void visitNumber(Number n) {
        count.increment();
    }

    public void visitPlus(Plus p) {
        // do nothing
    }

    @Override
    public void visitMinus(Minus m) {
        // do nothing
    }

    public long getCount() {
        return count.longValue();
    }
}
