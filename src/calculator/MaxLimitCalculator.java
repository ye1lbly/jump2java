package calculator;

public class MaxLimitCalculator extends Calculator {
    int getValue() {
        if (this.value > 100) {
            this.value = 100;
        }
        return this.value;
    }
}
