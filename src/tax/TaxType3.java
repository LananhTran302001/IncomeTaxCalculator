package tax;

public class TaxType3 extends IncomeTax {

    /**
     * @param totalIncome: tổng thu nhập (VND)
     * @param taxReduction: các khoản giảm trừ (VND)
     * @param taxExemption: các khoản miễn thuế (VND)
     */
    public TaxType3(int totalIncome, int taxReduction, int taxExemption) {
        super(totalIncome, taxReduction, taxExemption);
    }

    @Override
    public int getTaxValue() {
        int taxableIncome = getTaxableIncome();
        if (taxableIncome < 0) {
            return -1;
        }

        return (int) Math.ceil(taxableIncome * 0.2);
    }
}
