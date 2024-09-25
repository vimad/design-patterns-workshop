/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package visitor.exercise1;

import java.util.*;

public class EmailSendingVisitor implements Visitor {
    private final String msg;

    public EmailSendingVisitor(String msg) {
        this.msg = msg;
    }

    @Override
    public void visit(Person person) {
        System.out.println("To: " + person.email());
        System.out.println("Msg: " + msg);
        System.out.println();
    }

    @Override
    public void visit(DistributionList distributionList) {
        // do nothing
    }
}
