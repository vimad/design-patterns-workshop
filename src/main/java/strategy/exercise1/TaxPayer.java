/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package strategy.exercise1;

public class TaxPayer {
    public static final int COMPANY = 0;
    public static final int EMPLOYEE = 1;
    public static final int TRUST = 2;
    public static final double COMPANY_RATE = 0.30;
    public static final double EMPLOYEE_RATE = 0.45;
    public static final double TRUST_RATE = 0.35;

    private final double income;
    private final int type;

    public TaxPayer(int type, double income) {
        this.type = type;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public double extortCash() {
        return switch (type) {
            case COMPANY -> income * COMPANY_RATE;
            case EMPLOYEE -> income * EMPLOYEE_RATE;
            case TRUST -> income * TRUST_RATE;
            default -> throw new IllegalArgumentException();
        };
    }
}
