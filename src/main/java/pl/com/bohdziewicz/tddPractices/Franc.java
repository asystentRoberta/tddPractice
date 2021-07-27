package pl.com.bohdziewicz.tddPractices;

public class Franc extends Money {

    public Franc(int amount) {

        this.amount = amount;
    }

    Franc times(int multiplayer) {

        return new Franc(amount * multiplayer);
    }
}
