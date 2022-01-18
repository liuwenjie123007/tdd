package gitbub.com.liuwenjie1234007.tdd.ch1;

public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);
}
