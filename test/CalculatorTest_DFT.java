import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest_DFT {

    @Test
    void test1() {
        assertEquals(-1, new Calculator().calculate(10000000, 1000000,
                500000, true, 50));
    }

    @Test
    void test2() {
        assertEquals(1700000, new Calculator().calculate(10000000, 1000000,
                500000, false, 20));
    }

    @Test
    void test3() {
        assertEquals(850000, new Calculator().calculate(10000000, 1000000,
                500000, true, 1));
    }

    @Test
    void test4() {
        assertEquals(600000, new Calculator().calculate(10000000, 1000000,
                500000, true, 12));
    }
}