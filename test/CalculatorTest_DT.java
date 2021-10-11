import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest_DT {

    @Test
    void test1() {
        assertEquals(-1, new Calculator().calculate(-25000000, 1500000,
                2120000, false, 5));
    }

    @Test
    void test2() {
        assertEquals(-1, new Calculator().calculate(90000000, -200000,
                30000000, true, 16));
    }

    @Test
    void test3() {
        assertEquals(-1, new Calculator().calculate(20000000, 10000000,
                -40000000, true, 12));
    }

    @Test
    void test4() {
        assertEquals(-1, new Calculator().calculate(19500000, 1000000,
                500000, true, -5));
    }

    @Test
    void test5() {
        assertEquals(-1, new Calculator().calculate(12800000, 1210000,
                890000, false, 40));
    }

    @Test
    void test6() {
        assertEquals(-1, new Calculator().calculate(8000000, 7000000,
                6000000, true, 20));
    }

    @Test
    void test7() {
        assertEquals(4330000, new Calculator().calculate(25000000, 1350000,
                2000000, false, 15));
    }

    @Test
    void test8() {
        assertEquals(980000, new Calculator().calculate(15000000, 5000000,
                200000, true, 0));
    }

    @Test
    void test9() {
        assertEquals(227500, new Calculator().calculate(4900000, 120000,
                230000, true, 12));
    }

    @Test
    void test10() {
        assertEquals(565000, new Calculator().calculate(16000000, 6000000,
                1850000, true, 8));
    }

    @Test
    void test11() {
        assertEquals(1032000, new Calculator().calculate(12000000, 0,
                120000, true, 9));
    }

    @Test
    void test12() {
        assertEquals(4090000, new Calculator().calculate(60000000, 20550000,
                10750000, true, 10));
    }

    @Test
    void test13() {
        assertEquals(7322500, new Calculator().calculate(50590000, 6000000,
                2300000, true, 6));
    }

    @Test
    void test14() {
        assertEquals(13500000, new Calculator().calculate(75000000, 10000000,
                500000, true, 18));
    }

    @Test
    void test15() {
        assertEquals(26991000, new Calculator().calculate(120000000, 5640000,
                9100000, true, 24));
    }
}