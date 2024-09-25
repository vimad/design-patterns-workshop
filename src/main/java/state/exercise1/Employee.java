/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package state.exercise1;

import java.util.*;

/**
 * Code without clear state machine transitions.  It is very
 * ugly.  Your job is to use the state pattern to clean things
 * up.
 */
public class Employee {
    private static final Map<State, State> advanceStateTransitionMap =
        Map.of(State.PROGRAMMER, State.MANAGER,
            State.MANAGER, State.RETIREE,
            State.RETIREE, State.END);
    private static final Map<State, State> fireStateTransitionMap =
        Map.of(State.PROGRAMMER, State.END,
            State.MANAGER, State.END);

    private State state = new ProgrammerState();

    public int pay() {
        return state.pay();
    }

    public void advance() {
        setState(state.advance());
    }

    public void fire() {
        setState(state.fire());
    }

    private void setState(State state) {
        System.out.println(this.state.getClass().getSimpleName() +
            " -> " + state.getClass().getSimpleName());
        this.state = state;
    }
}
