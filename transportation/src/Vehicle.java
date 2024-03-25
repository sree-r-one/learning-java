public class Vehicle {

    // Instance variables

    /**
     * Current Year 2024
     */
    protected int currYear;

    /**
     * Age of vehicle wrt to currYear
     */
    protected int age;

    /**
     * Amount of gas remaining in the tank
     * Default is 0
     */
    protected int gasRemained;

    /**
     * Amount of gas consumed per hour when the vehicle is running
     * Car is 10
     * Bike is 0
     */
    protected int gasConsumedPerHour;

    /**
     * Total amount of gas consumed by the vehicle
     * Defaults to 0
     */
    protected int totalGasConsumed;

    /**
     * Type of the vehicle
     * Car or Bike
     */
    protected String brand;

    /**
     * Brand of vehicle
     */
    protected String type;

    /**
     * Maximum amount of gas the tank can hold
     */
    protected int maxGasAmountInTank;

    // Constructors

    public Vehicle() {
        this.currYear = 2024;
        this.totalGasConsumed = 0;
        this.gasRemained = 0;
    }

    // Setters and getters

    /**
     * Gets age of vehicle
     * 
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets gas remining in the tank
     * 
     * @return gasRemained
     */
    public int getGasRemained() {
        return gasRemained;
    }

    /**
     * Gets total gas consumed by running
     * 
     * @return gasConsumedPerHour
     */
    public int getGasConsumedPerHour() {
        return gasConsumedPerHour;
    }

    /**
     * Should be overridden by subclasses Car and Bike
     * 
     * For car, adds given amount of fuel into the car
     * 
     * For bike, prints "You don't need to refuel a bike"
     * 
     * @param amountOfGas
     */
    public void refuel(int amountOfGas) {
    }

    /**
     * Should be overridden by subclasses Car and Bike
     * 
     * For car, tells the car to run for a given number of hours
     * 
     * For bike, print "Eco-friendly travel by bicycle!"
     * 
     * @param hours
     */
    public void run(int hours) {
    }

    @Override
    public String toString() {
        return "";
    }

    /**
     * 
     */
    @Override
    public boolean equals(Object obj) {
        return false;
    }

}
