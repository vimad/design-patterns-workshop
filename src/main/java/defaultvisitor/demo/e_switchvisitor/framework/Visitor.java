/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package defaultvisitor.demo.e_switchvisitor.framework;

public abstract class Visitor {
    public final void visit(Expression expression) {
        switch (expression) {
            case Number n -> visitNumber(n);
            case Plus p -> {
                visit(p.first());
                visit(p.second());
                visitPlus(p);
            }
        }
    }

    protected void visitNumber(Number n) {
    }

    protected void visitPlus(Plus p) {
    }
}
