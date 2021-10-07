package tax;

public class TaxType1 extends IncomeTax {

    public TaxType1(int totalIncome, int taxReduction, int taxExemption) {
        super(totalIncome, taxReduction, taxExemption);
    }

    @Override
    public int getTaxValue() {
        return 0;
    }
}
