/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package command.exercise1;

public class SwitchFactory {
    private SwitchFactory() {
    }

    public static Switch make(Fan fan) {
        throw new UnsupportedOperationException("todo");
    }

    public static Switch make(Light light) {
        throw new UnsupportedOperationException("todo");
    }
}
