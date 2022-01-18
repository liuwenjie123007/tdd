package gitbub.com.liuwenjie1234007.tdd.ch1;

/**
 * @author liuwenjie
 * @since 1.0.0
 **/
public class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        if (object instanceof Money money) {
            return amount == money.amount;
        }
        return false;
    }
}
