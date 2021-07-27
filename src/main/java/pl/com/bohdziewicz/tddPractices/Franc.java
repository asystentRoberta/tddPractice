package pl.com.bohdziewicz.tddPractices;

public class Franc extends Money {

    private final String currency;

    public Franc(int amount) {

        this.amount = amount;
        currency = "CHF";
    }

    Money times(int multiplayer) {

        return new Franc(amount * multiplayer);
    }

    String currency() {

        return currency;
    }
}
