package pl.com.bohdziewicz.tddPractices;

public class Franc extends Money {

    public Franc(int amount, String currency) {

        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplayer) {

        return Money.franc(amount * multiplayer);
    }
}
