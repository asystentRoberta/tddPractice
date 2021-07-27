package pl.com.bohdziewicz.tddPractices;

public class Franc {

    private int ammount;

    public Franc(int ammount) {

        this.ammount = ammount;
    }

    Franc times(int multiplayer) {

        return new Franc(ammount * multiplayer);
    }

    @Override public boolean equals(Object o) {

        if (o instanceof Franc) {
            Franc franc = (Franc) o;
            return ammount == franc.ammount;
        }
        return false;
    }
}
