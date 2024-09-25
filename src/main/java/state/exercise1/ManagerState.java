package state.exercise1;

public class ManagerState implements State {
    @Override
    public int pay() {
        System.out.println("Paying lots of $$$ to manager");
        return 30000;
    }

    @Override
    public State advance() {
        return RETIREE;
    }

    @Override
    public State fire() {
        return END;
    }
}
