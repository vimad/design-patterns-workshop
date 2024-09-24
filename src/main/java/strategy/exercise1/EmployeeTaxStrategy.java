package strategy.exercise1;

public class EmployeeTaxStrategy implements TaxStrategy {
    private static final double RATE = 0.45;

    private final TaxPayer context;

    public EmployeeTaxStrategy(TaxPayer context) {
        this.context = context;
    }

    @Override
    public double extortCash() {
        return context.getIncome() * RATE;
    }
}
