/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */
package visitor.solution1b;

public class Person implements Contact {
    private final String email;

    public Person(String email) {
        this.email = email;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String email() {
        return email;
    }
}
