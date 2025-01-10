
public class Dollar {
    public int fAmount;

    public Dollar(int amount) {
        fAmount = amount;
    }

    public Dollar times(int multiplier) {
        // fAmount *= multiplier;
        // return null;
        return new Dollar(fAmount * multiplier);
    }

    public int getAmount() {
        return fAmount;
    }

    @Override
    public boolean equals(Object anotherDollar) {

        if (anotherDollar instanceof Dollar) {
            Dollar another = (Dollar) anotherDollar;
            return fAmount == another.getAmount();
        }

        // Default
        return false;
    }

}
