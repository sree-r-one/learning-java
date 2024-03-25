public class Bike extends Vehicle {

    public Bike(String brand, int yearPurchased) {
        this.brand = brand;
        this.type = "Bike";
        this.age = this.currYear - yearPurchased;
        this.gasConsumedPerHour = 0;
    }

    @Override
    public void refuel(int amountOfGas) {
        // TODO Auto-generated method stub
        super.refuel(amountOfGas);
    }

    @Override
    public void run(int hours) {
        // TODO Auto-generated method stub
        super.run(hours);
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
