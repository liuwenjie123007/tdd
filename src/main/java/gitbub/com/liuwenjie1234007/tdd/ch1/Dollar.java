package gitbub.com.liuwenjie1234007.tdd.ch1;

/**
 * @author liuwenjie
 * @since 1.0.0
 **/
public class Dollar {
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        amount *= multiplier;
    }
}
