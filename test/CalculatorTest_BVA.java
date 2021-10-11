import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest_BVA {

    private final int MAX_INT = 2147483647; // = 2^31 - 1
    private final int totalIncomeNom = 50000000;
    private final int taxReductionNom = 10000000;
    private final int taxExemptionNom = 10000000;
    private final int laborContractTimeNom = 18;

    @Test
    void test0() {
        assertEquals(4169000, new Calculator().calculate(40000000, 8605000,
                2300000, true, 12));
    }

    @Test
    void test1() {
        assertEquals(-1, new Calculator().calculate(0, taxReductionNom,
                taxExemptionNom, true, laborContractTimeNom));
    }

    @Test
    void test2() {
        assertEquals(-1, new Calculator().calculate(0, taxReductionNom,
                taxExemptionNom, false, laborContractTimeNom));
    }

    @Test
    void test3() {
        assertEquals(-1, new Calculator().calculate(1, taxReductionNom,
                taxExemptionNom, true, laborContractTimeNom));
    }

    @Test
    void test4() {
        assertEquals(-1, new Calculator().calculate(1, taxReductionNom,
                taxExemptionNom, false, laborContractTimeNom));
    }

    @Test
    void test5() {
        assertEquals(734769277, new Calculator().calculate(MAX_INT - 1, taxReductionNom,
                taxExemptionNom, true, laborContractTimeNom));
    }

    @Test
    void test6() {
        assertEquals(425496730, new Calculator().calculate(MAX_INT - 1, taxReductionNom,
                taxExemptionNom, false, laborContractTimeNom));
    }

    @Test
    void test7() {
        assertEquals(734769277, new Calculator().calculate(MAX_INT, taxReductionNom,
                taxExemptionNom, true, laborContractTimeNom));
    }

    @Test
    void test8() {
        assertEquals(425496730, new Calculator().calculate(MAX_INT, taxReductionNom,
                taxExemptionNom, false, laborContractTimeNom));
    }

    // -----------------------------------------------------------------------------------

    @Test
    void test9() {
        assertEquals(6750000, new Calculator().calculate(totalIncomeNom, 0,
                taxExemptionNom, true, laborContractTimeNom));
    }

    @Test
    void test10() {
        assertEquals(8000000, new Calculator().calculate(totalIncomeNom, 0,
                taxExemptionNom, false, laborContractTimeNom));
    }

    @Test
    void test11() {
        assertEquals(6750000, new Calculator().calculate(totalIncomeNom, 1,
                taxExemptionNom, true, laborContractTimeNom));
    }

    @Test
    void test12() {
        assertEquals(8000000, new Calculator().calculate(totalIncomeNom, 1,
                taxExemptionNom, false, laborContractTimeNom));
    }

    @Test
    void test13() {
        assertEquals( -1, new Calculator().calculate(totalIncomeNom, MAX_INT - 1,
                taxExemptionNom, true, laborContractTimeNom));
    }

    @Test
    void test14() {
        assertEquals(-1, new Calculator().calculate(totalIncomeNom, MAX_INT - 1,
                taxExemptionNom, false, laborContractTimeNom));
    }

    @Test
    void test15() {
        assertEquals(-1, new Calculator().calculate(totalIncomeNom, MAX_INT,
                taxExemptionNom, true, laborContractTimeNom));
    }

    @Test
    void test16() {
        assertEquals(-1, new Calculator().calculate(totalIncomeNom, MAX_INT,
                taxExemptionNom, false, laborContractTimeNom));
    }

    //-------------------------------------------------------------------

    @Test
    void test17() {
        assertEquals(6750000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                0, true, laborContractTimeNom));
    }

    @Test
    void test18() {
        assertEquals(8000000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                0, false, laborContractTimeNom));
    }

    @Test
    void test19() {
        assertEquals(6750000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                1, true, laborContractTimeNom));
    }

    @Test
    void test20() {
        assertEquals(8000000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                1, false, laborContractTimeNom));
    }

    @Test
    void test21() {
        assertEquals(-1, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                MAX_INT - 1, true, laborContractTimeNom));
    }

    @Test
    void test22() {
        assertEquals(-1, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                MAX_INT - 1, false, laborContractTimeNom));
    }

    @Test
    void test23() {
        assertEquals(-1, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                MAX_INT, true, laborContractTimeNom));
    }

    @Test
    void test24() {
        assertEquals(-1, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                MAX_INT, false, laborContractTimeNom));
    }

    // ---------------------------------------------------------------------------------

    @Test
    void test25() {
        assertEquals(3000000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                taxExemptionNom, true, 0));
    }

    @Test
    void test26() {
        assertEquals(6000000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                taxExemptionNom, false, 0));
    }

    @Test
    void test27() {
        assertEquals(3000000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                taxExemptionNom, true, 1));
    }

    @Test
    void test28() {
        assertEquals(6000000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                taxExemptionNom, false, 1));
    }

    @Test
    void test29() {
        assertEquals(4350000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                taxExemptionNom, true, 35));
    }

    @Test
    void test30() {
        assertEquals(6000000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                taxExemptionNom, false, 35));
    }

    @Test
    void test31() {
        assertEquals(4350000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                taxExemptionNom, true, 36));
    }

    @Test
    void test32() {
        assertEquals(6000000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                taxExemptionNom, false, 36));
    }

    @Test
    void test33() {
        assertEquals(4350000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                taxExemptionNom, true, laborContractTimeNom));
    }

    @Test
    void test34() {
        assertEquals(6000000, new Calculator().calculate(totalIncomeNom, taxReductionNom,
                taxExemptionNom, false, laborContractTimeNom));
    }
}