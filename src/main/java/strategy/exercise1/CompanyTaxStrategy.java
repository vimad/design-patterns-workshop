package strategy.exercise1;

public class CompanyTaxStrategy implements TaxStrategy {
    private static final double RATE = 0.30;

    private final TaxPayer context;

    public CompanyTaxStrategy(TaxPayer context) {
        this.context = context;
    }

    @Override
    public double extortCash() {
        return context.getIncome() * RATE;
    }
}
