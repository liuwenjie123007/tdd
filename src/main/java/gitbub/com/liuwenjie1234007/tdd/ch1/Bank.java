package gitbub.com.liuwenjie1234007.tdd.ch1;

import java.util.Hashtable;

/**
 * @author liuwenjie
 * @since 1.0.0
 **/
public class Bank {

    private Hashtable<Pair, Integer> rates = new Hashtable<>();

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        return rates.get(new Pair(from, to));
    }

    private class Pair {
        private String from;
        private String to;

        Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public boolean equals(Object object) {
            Pair pair = (Pair) object;
            return from.equals(pair.from) && to.equals(pair.to);
        }

        public int hashCode() {
            return 0;
        }
    }
}

