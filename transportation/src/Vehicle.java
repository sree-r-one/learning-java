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

    // Constructors

    public Vehicle() {
        this.currYear = 2024;
        this.totalGasConsumed = 0;
        this.gasRemained = 0;
    }

    @Override
    public String toString() {
        return "Vehicle []";
    }

}
