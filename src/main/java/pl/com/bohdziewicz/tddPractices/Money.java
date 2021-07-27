package pl.com.bohdziewicz.tddPractices;

public class Money {

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {

        this.amount = amount;
        this.currency = currency;
    }

    static Dollar dollar(int amount) {

        return new Dollar(amount, "USD");
    }

    static Franc franc(int amount) {

        return new Franc(amount, "CHF");
    }

    Money times(int multiplier) {

        return null;
    }

    @Override
    public boolean equals(Object object) {

        if (object instanceof Money) {
            Money money = (Money) object;
            return amount == money.amount &&
                    getClass().equals(money.getClass());
        }
        return false;
    }

    String currency() {

        return currency;
    }

    public String toString(){
        return amount + " " + currency;
    }
}
