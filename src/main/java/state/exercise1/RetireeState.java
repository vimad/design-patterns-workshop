package state.exercise1;

public class RetireeState implements State {
    @Override
    public int pay() {
        System.out.println("Handing out crumbs to retiree");
        return 5000;
    }

    @Override
    public State advance() {
        return END;
    }
}
