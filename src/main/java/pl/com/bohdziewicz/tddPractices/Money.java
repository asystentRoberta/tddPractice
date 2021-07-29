package pl.com.bohdziewicz.tddPractices;

public class Money implements Expression {

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {

        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {

        return new Money(amount, "USD");
    }

    static Money franc(int amount) {

        return new Money(amount, "CHF");
    }

    Money times(int multiplier) {

        return new Money(amount * multiplier, currency);
    }

    @Override
    public boolean equals(Object object) {

        if (object instanceof Money) {
            Money money = (Money) object;
            return amount == money.amount &&
                    currency().equals(money.currency());
        }
        return false;
    }

    String currency() {

        return currency;
    }

    public String toString() {

        return amount + " " + currency;
    }

    Expression plus(Money addend) {

        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to) {

        int rate = (currency.equals("CHF") && to.equals("USD"))
                ? 2
                : 1;

        return new Money(amount / rate, to);
    }
}
