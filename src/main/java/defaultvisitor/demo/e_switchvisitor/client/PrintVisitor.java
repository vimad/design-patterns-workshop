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

public class PrintVisitor extends Visitor {
    protected final StringBuilder sb = new StringBuilder();

    public void visitPlus(Plus s) {
        sb.append("+ ");
    }

    public void visitNumber(Number n) {
        sb.append(n.getValue()).append(' ');
    }

    public String toString() {
        return sb.toString().trim();
    }
}
