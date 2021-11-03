import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest_WBT {

    @Test
    void test1() {
        assertEquals(-1, new Calculator().calculate(16000000, 2000000,
                1000000, false, 50));
    }

    @Test
    void test2() {
        assertEquals(2600000, new Calculator().calculate(16000000, 2000000,
                1000000, false, 6));
    }

    @Test
    void test3() {
        assertEquals(1300000, new Calculator().calculate(16000000, 2000000,
                1000000, true, 0));
    }

    @Test
    void test4() {
        assertEquals(1200000, new Calculator().calculate(16000000, 2000000,
                1000000, true, 16));
    }
}