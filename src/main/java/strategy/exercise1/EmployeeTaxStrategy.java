package strategy.exercise1;

public final class EmployeeTaxStrategy implements TaxStrategy {
    private static final double RATE = 0.45;

    @Override
    public double extortCash(TaxPayer context) {
        return context.getIncome() * RATE;
    }
}
