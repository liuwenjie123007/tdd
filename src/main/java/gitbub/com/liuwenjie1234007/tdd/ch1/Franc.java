package gitbub.com.liuwenjie1234007.tdd.ch1;

/**
 * @author liuwenjie
 * @since 1.0.0
 **/
public class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

}
