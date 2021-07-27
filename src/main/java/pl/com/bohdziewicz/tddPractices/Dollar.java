package pl.com.bohdziewicz.tddPractices;

public class Dollar {

    private final int amount;

    Dollar(int amount) {

        this.amount = amount;
    }

    Dollar times(int multiplier) {

        return new Dollar(amount * multiplier);
    }

    @Override public boolean equals(Object o) {

        if (o instanceof Dollar) {
            Dollar dollar = (Dollar) o;
            return amount == dollar.amount;
        }
        return false;
    }
}
