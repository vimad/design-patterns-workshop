/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package defaultvisitor.demo.b_originalvisitorwithminus.framework;

public interface Visitor {
    void visitNumber(Number n);

    void visitPlus(Plus p);

    void visitMinus(Minus m);
}
