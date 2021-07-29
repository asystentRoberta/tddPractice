package pl.com.bohdziewicz.tddPractices;

class Pair {

    private String from;
    private String to;

    Pair(String from, String to) {

        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object object) {

        if (object instanceof Pair) {
            Pair pair = (Pair) object;
            return from.equals(pair.from) && to.equals(pair.to);
        }
        return false;
    }

    @Override
    public int hashCode() {

        return 0;
    }
}
