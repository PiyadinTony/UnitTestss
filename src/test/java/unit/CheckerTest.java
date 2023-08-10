package unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CheckerTest {

    @Test
    public void isNumberNegativeTesting() {
        Assertions.assertFalse(CalculateVoid.isNumber("sdsfsd"));
    }

    @Test
    public void isNumberTesting() {
        Assertions.assertTrue(CalculateVoid.isNumber("3242342.3"));
    }

    @Test
    void isEmptyPositiveTesting() {
        Assertions.assertTrue(CalculateVoid.isEmpty(""));
    }

    @Test
    void isEmptyNegativeTesting() {
        Assertions.assertFalse(CalculateVoid.isEmpty("TestEmpty"));
    }

    @Test
    void isFinalTesting() {
        Assertions.assertEquals(CalculateVoid.checkDoubleForTestMethod("100"), CalculateVoid.checkDoubleForTestMethod("100"));
    }

    @Test
    void isLengthCorrectTesting() {
        Assertions.assertTrue(CalculateVoid.isLengthCorrect("12", 2));
    }

    @Test
    void isLengthNegativeCorrectTesting() {
        Assertions.assertFalse(CalculateVoid.isLengthCorrect("100", 1));
    }

    @Test
    void AddMathMethodTesting() {
        Assertions.assertTrue(CalculateVoid.AddCalculateForTest(1.1, 1));
    }

    @Test
    void SubtractMathMethodTesting() {
        Assertions.assertTrue(CalculateVoid.SubtractCalculateForTest(10.2, 13));
    }

    @Test
    void MultiplyMathMethodTesting() {
        Assertions.assertTrue(CalculateVoid.MultiplyCalculateForTest(10.2, 12));
    }

    @Test
    void DivideMathMethodTesting() {
        Assertions.assertTrue(CalculateVoid.DivideCalculateForTest(10.2, 10));
    }

    @Test
    void DivideMathMethodZeroTesting() {
        Assertions.assertFalse(CalculateVoid.DivideCalculateForTest(10.2, 0));
    }

    @Test
    void CheckBdValidValue() {
        Double expected = 1.111;
        Double input = 1.11111111111111;
        Assertions.assertEquals(expected, CalculateVoid.bigDecimal(input));
    }

    @Test
    void CheckBdValidNegativeValue() {
        Double expected = 1.1111;
        Double input = 1.1111;
        Assertions.assertNotEquals(expected, CalculateVoid.bigDecimal(input));
    }
}
