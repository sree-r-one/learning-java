public class Car extends Vehicle {

    // Constructor

    public Car(String brand, int yearPurchased) {
        this.brand = brand;
        this.age = this.currYear - yearPurchased;
        this.gasConsumedPerHour = 10;
        this.maxGasAmountInTank = 200;
    }

    /**
     * Overriding refuel method
     * 
     * Make sure that there's room in the gas in the tank for the given amount of
     * gas
     * 
     * If the amount of gas plus gas in tank is greater than the max amount of gas,
     * set the remaining amount of gas to the max amount of gas
     * 
     * Else return the given amout of gas remaining in the tank
     */
    @Override
    public void refuel(int amountOfGas) {

        this.gasRemained += amountOfGas;

        if (this.gasRemained > this.maxGasAmountInTank) {
            this.gasRemained = this.maxGasAmountInTank;
        }
    }

    /**
     * Overriding run method
     * 
     * For the car, check the amount of gas remaining in the tank If it is smaller
     * than or equal to 0, print "Gas out! Please add fuel!"
     * 
     * 
     * 
     */
    @Override
    public void run(int hours) {

        if (this.gasRemained <= 0) {
            System.out.println("Gas out! Please add fuel!");
            return;
        }

        int gasConsumed = hours * this.gasConsumedPerHour;

        this.gasRemained -= gasConsumed;

        if (this.gasRemained <= 0) {
            this.gasRemained = 0;
            System.out.println("Oops, gas out! Please add fuel!");
        } else {
            this.totalGasConsumed += gasConsumed;
        }

    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
