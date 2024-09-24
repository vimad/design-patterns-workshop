package strategy.exercise1;

public class TrustTaxStrategy implements TaxStrategy {
    private static final double RATE = 0.35;

    private final TaxPayer context;

    public TrustTaxStrategy(TaxPayer context) {
        this.context = context;
    }

    @Override
    public double extortCash() {
        return context.getIncome() * RATE;
    }
}
