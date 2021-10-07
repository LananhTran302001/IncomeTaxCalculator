package tax;

public class TaxType2 extends IncomeTax {

    public TaxType2(int totalIncome, int taxReduction, int taxExemption) {
        super(totalIncome, taxReduction, taxExemption);
    }

    @Override
    public int getTaxValue() {
        return taxableIncome * 10 / 100;
    }
}
