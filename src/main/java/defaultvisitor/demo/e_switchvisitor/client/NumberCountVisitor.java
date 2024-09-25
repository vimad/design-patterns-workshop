/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package defaultvisitor.demo.e_switchvisitor.client;

import defaultvisitor.demo.e_switchvisitor.framework.Number;
import defaultvisitor.demo.e_switchvisitor.framework.Plus;
import defaultvisitor.demo.e_switchvisitor.framework.Visitor;

import java.util.concurrent.atomic.*;

public class NumberCountVisitor extends Visitor {
    private final LongAdder count = new LongAdder();

    public void visitNumber(Number n) {
        count.increment();
    }

    public long getCount() {
        return count.longValue();
    }
}
