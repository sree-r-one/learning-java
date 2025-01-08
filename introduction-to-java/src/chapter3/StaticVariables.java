package chapter3;
import java.util.ArrayList;

public class  Car {

    // Instantiate Arraylist
    static Arraylist<Car> CAR_LIST = new Arraylist<Car>();

    public Car(){
        Car.CAR_LIST.add(this);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        for (Car car : Car.CAR_LIST) {
            System.out.println(car);
        }
    }
}

public class HelperClass{

    // Return true if x is valid 
    public static boolean isValid(int x){
        return HelperClass.isEven(x) && HelperClass.isGreaterThanZero(x);
    }

    // Return true if x is greater than 0 
    public static boolean isGreaterThanZero(int x){
        return (x > 0 );
    }

    // Return true iof x is even 
    public static boolen isEven(int x){
        return (x % 2 == 0);
    }
}



public class StaticVariables {

    // Define static variables 
    static String DEPARTMENT = "Accounting"; 

    // Instance Variable 
    String name; 

    // Constructor 
    public StaticVariables(String name){
        this.name = name; 
    }

    public static void main(String[] args) {

        // Declare the instances
        StaticVariables object1 = new StaticVariables("Sree");
        StaticVariables object2 = new StaticVariables("Reshu");
        
    }
}