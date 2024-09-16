/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package defaultvisitor.demo.a_originalvisitor.client;

import defaultvisitor.demo.a_originalvisitor.framework.Number;
import defaultvisitor.demo.a_originalvisitor.framework.*;

import java.util.concurrent.atomic.*;

public class NumberCountVisitor implements Visitor {
    private final LongAdder count = new LongAdder();

    public void visitNumber(Number n) {
        count.increment();
    }

    public void visitPlus(Plus p) {
        // do nothing
    }

    public long getCount() {
        return count.longValue();
    }
}
