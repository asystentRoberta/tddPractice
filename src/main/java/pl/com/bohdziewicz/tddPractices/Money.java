package pl.com.bohdziewicz.tddPractices;

public abstract class Money {

    protected int amount;
    protected String currency;

    static Dollar dollar(int amount) {

        return new Dollar(amount, "USD");
    }

    static Franc franc(int amount) {

        return new Franc(amount, "CHF");
    }

    abstract Money times(int multiplier);

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
}
