package tax;

public abstract class IncomeTax {
    private int taxableIncome;

    /**
     * @param totalIncome: tổng thu nhập (VND)
     * @param taxReduction: các khoản giảm trừ (VND)
     * @param taxExemption: các khoản miễn thuế (VND)
     */
    protected IncomeTax(int totalIncome, int taxReduction, int taxExemption) {
        if (totalIncome < 0 || taxReduction < 0 || taxExemption < 0) {
            taxableIncome = -1;
        } else if (totalIncome - taxReduction - taxExemption < 0) {
            taxableIncome = -1;
        } else {
            taxableIncome = totalIncome - taxReduction - taxExemption;
        }
    }

    public int getTaxableIncome() {
        return taxableIncome;
    }

    public abstract int getTaxValue();
}
