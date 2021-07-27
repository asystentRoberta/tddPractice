package pl.com.bohdziewicz.tddPractices;

public class Dollar extends Money {

    Dollar(int amount, String currency) {

        this.amount = amount;
        this.currency = "USD";
    }

    Money times(int multiplier) {

        return Money.dollar(amount * multiplier);
    }
}
