package pl.com.bohdziewicz.tddPractices;

public class Money {

    protected int amount;

    @Override
    public boolean equals(Object object) {

        if (object instanceof Money) {
            Money money = (Money) object;
            return amount == money.amount &&
                    getClass().equals(money.getClass());
        }
        return false;
    }
}
