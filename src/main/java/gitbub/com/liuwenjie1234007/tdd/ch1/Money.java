package gitbub.com.liuwenjie1234007.tdd.ch1;

/**
 * @author liuwenjie
 * @since 1.0.0
 **/
public abstract class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        if (object instanceof Money money) {
            return amount == money.amount && getClass().equals(money.getClass());
        }
        return false;
    }

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);
}
