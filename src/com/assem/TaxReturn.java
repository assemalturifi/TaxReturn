package com.assem;

public class TaxReturn {
    private final int single = 1;
    private final int married = 2;
    private final double rate1 = 0.15;
    private final double rate2 = 0.28;
    private final double rate3 = 0.31;
    private final double single_Bracket1 = 21450;
    private final double single_Bracket2 = 51900;
    private final double married_Bracket1 = 35800;
    private final double married_Bracket2 = 86500;
    private final double income;
    private final int status;

    public TaxReturn(double income, int status) {
        this.income = income;
        this.status = status;
    }

    public double getTax() {
        double tax = 0;
        if (status == single) {
            if (income <= single_Bracket1) {
                tax = rate1 * income;
            } else if (income <= single_Bracket2) {
                tax = rate1 * single_Bracket1 + rate2 * (income - single_Bracket1);
            } else {
                tax = rate1 * single_Bracket1 + rate2 * (single_Bracket2 - single_Bracket1) + rate3 * (income - single_Bracket2);
            }
        }
        else {
            if (income <= married_Bracket1) {
                tax = rate1 * income;
            } else if (income <= married_Bracket2) {
                tax = rate1 * married_Bracket1 + rate2 * (income - married_Bracket1);
            } else {
                tax = rate1 * married_Bracket1 + rate2 * (married_Bracket2 - married_Bracket1) + rate3 * (income - married_Bracket2);
            }
        }
        return tax;


    }
}