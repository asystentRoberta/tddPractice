package pl.com.bohdziewicz.tddPractices;

public abstract class Money {

    protected int amount;

    static Dollar dollar(int amount) {

        return new Dollar(amount);
    }

    static Franc franc(int amount) {

        return new Franc(amount);
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

    abstract String currency();
}
