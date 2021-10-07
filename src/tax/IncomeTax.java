package tax;

public abstract class IncomeTax {
    int taxableIncome;

    public IncomeTax(int totalIncome, int taxReduction, int taxExemption) {
        // totalIncome: tổng thu nhập
        // taxReduction: các khoản giảm trừ
        // taxExemption: các khoản miễn thuế
        taxableIncome = totalIncome - taxReduction - taxExemption;
    }

    public abstract int getTaxValue();
}
