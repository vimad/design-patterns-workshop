/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package composite.exercise1;

//DON'T CHANGE
public class MailClient {
    public static void main(String... args) {
        var tjsn = new DistributionList();
        tjsn.add(new Person("john@aol.com"));
        var students = new DistributionList();
        students.add(new Person("peterz@intnet.mu"));
        tjsn.add(students);
        tjsn.add(new Person("anton@bea.com"));
        tjsn.sendMail(
            "Welcome to The Java Specialists' Newsletter");
    }
}
