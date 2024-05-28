package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @Test
    public void testIsEvenWithEvenNumber() {
        assertTrue(MainHW.evenOddNumber(2));
    }

    @Test
    public void testIsEvenWithOddNumber() {
        assertFalse(MainHW.evenOddNumber(3));
    }

    @Test
    public void testIsEvenWithZero() {
        assertTrue(MainHW.evenOddNumber(0));
    }

    @Test
    public void testIsEvenWithNegativeEvenNumber() {
        assertTrue(MainHW.evenOddNumber(-4));
    }

    @Test
    public void testIsEvenWithNegativeOddNumber() {
        assertFalse(MainHW.evenOddNumber(-5));
    }

    @Test
    void falseNumberInInterval(){
        assertFalse(MainHW.numberInInterval(10));
    }
    @Test
    void trueNumberInInterval(){
        assertTrue(MainHW.numberInInterval(50));
    }
    @Test
    void behindNumberInInterval(){
        assertFalse(MainHW.numberInInterval(500));
    }
    @Test
    void negativeNumberInInterval(){
        assertFalse(MainHW.numberInInterval(-6));
    }
}