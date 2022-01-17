package gitbub.com.liuwenjie1234007.tdd.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author liuwenjie
 * @since 1.0.0
 **/
public class TestMultiCurrencyMoney {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
