package gitbub.com.liuwenjie1234007.tdd.ch1;

/**
 * @author liuwenjie
 * @since 1.0.0
 **/
public abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Money money) {
            return amount == money.amount && getClass().equals(money.getClass());
        }
        return false;
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    abstract Money times(int multiplier);

    String currency() {
        return currency;
    }
}
