/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package state.exercise1;

public interface State {
    default int pay() {
        return 0;
    }

    default State advance() {
        return this;
    }

    default State fire() {
        return this;
    }

    State PROGRAMMER = new ProgrammerState();
    State MANAGER = new ManagerState();
    State RETIREE = new RetireeState();
    State END = new EndState();
}
