package tax;

public class TaxType3 extends IncomeTax {

    public TaxType3(int totalIncome, int taxReduction, int taxExemption) {
        super(totalIncome, taxReduction, taxExemption);
    }

    @Override
    public int getTaxValue() {
        return 0;
    }
}
