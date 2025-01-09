
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

}
