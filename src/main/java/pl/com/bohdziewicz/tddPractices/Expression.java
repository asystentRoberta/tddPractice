package pl.com.bohdziewicz.tddPractices;

public interface Expression {

    Money reduce(Bank bank, String to);
}
