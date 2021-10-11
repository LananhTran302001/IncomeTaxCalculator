package tax;

public class TaxType1 extends IncomeTax {

    /**
     * @param totalIncome: tổng thu nhập (VND)
     * @param taxReduction: các khoản giảm trừ (VND)
     * @param taxExemption: các khoản miễn thuế (VND)
     */
    public TaxType1(int totalIncome, int taxReduction, int taxExemption) {
        super(totalIncome, taxReduction, taxExemption);
    }

    @Override
    public int getTaxValue() {
        int taxableIncome = getTaxableIncome();
        if (taxableIncome < 0) {
            return -1;
        }

        int incomeTax = 0;

        if (taxableIncome <= 5000000) {
            incomeTax = (int) Math.ceil(taxableIncome * 5 / 100);
        } else if (taxableIncome <= 10000000) {
            incomeTax = (int) Math.ceil(250000 + (taxableIncome - 5000000) * 0.1);
        } else if (taxableIncome <= 18000000) {
            incomeTax = (int) Math.ceil(750000 + (taxableIncome - 10000000) * 0.15);
        } else if (taxableIncome <= 32000000) {
            incomeTax = (int) Math.ceil(1950000 + (taxableIncome - 18000000) * 0.2);
        } else if (taxableIncome <= 52000000) {
            incomeTax = (int) Math.ceil(4750000 + (taxableIncome - 32000000) * 0.25);
        }else if (taxableIncome <= 80000000) {
            incomeTax = (int) Math.ceil(9750000 + (taxableIncome - 52000000) * 0.3);
        } else {
            incomeTax = (int) Math.ceil(18150000 + (taxableIncome - 80000000) * 0.35);
        }
        return incomeTax;
    }
}
