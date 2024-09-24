package strategy.exercise1;

public final class CompanyTaxStrategy implements TaxStrategy {
    private static final double RATE = 0.30;

    @Override
    public double extortCash(TaxPayer context) {
        return context.getIncome() * RATE;
    }
}
