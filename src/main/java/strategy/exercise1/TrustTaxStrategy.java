package strategy.exercise1;

public final class TrustTaxStrategy implements TaxStrategy {
    private static final double RATE = 0.35;

    @Override
    public double extortCash(TaxPayer context) {
        return context.getIncome() * RATE;
    }
}
