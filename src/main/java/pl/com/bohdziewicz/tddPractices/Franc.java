package pl.com.bohdziewicz.tddPractices;

public class Franc extends Money {

    Franc(int amount, String currency) {

        super(amount, currency);
    }

    Money times(int multiplayer) {

        return Money.franc(amount * multiplayer);
    }
}
