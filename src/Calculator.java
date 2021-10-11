import tax.TaxType1;
import tax.TaxType2;
import tax.TaxType3;

public class Calculator {

    /**
     * @param totalIncome: tổng thu nhập (VND)
     * @param taxReduction: các khoản giảm trừ (VND)
     * @param taxExemption: các khoản miễn thuế (VND)
     * @param isResident: cư trú tại Việt Nam (True/False)
     * @param laborContractTime: thời gian ký hợp đồng lao động (theo tháng)
     */
    public int calculate(int totalIncome,  int taxReduction,
                         int taxExemption, boolean isResident, int laborContractTime) {

        if ((laborContractTime < 0) || (laborContractTime > 36)) {
            return -1;
        }

        if (isResident) {
            if (laborContractTime >= 3) {
                return new TaxType1(totalIncome, taxReduction, taxExemption).getTaxValue();
            } else {
                return new TaxType2(totalIncome, taxReduction, taxExemption).getTaxValue();
            }
        }
        return new TaxType3(totalIncome, taxReduction, taxExemption).getTaxValue();
    }

    public String getTaxValue(int totalIncome,  int taxReduction,
                              int taxExemption, boolean isResident, int laborContractTime) {
        int tax = calculate(totalIncome, taxReduction, taxExemption, isResident, laborContractTime);
        return String.valueOf(tax) + " VND";
    }
}
