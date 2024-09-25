package state.exercise1;

public class ProgrammerState implements State {
    @Override
    public int pay() {
        System.out.println("Programmer getting paid");
        return 3000;
    }

    @Override
    public State advance() {
        return MANAGER;
    }

    @Override
    public State fire() {
        return END;
    }
}
