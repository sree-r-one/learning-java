public class VehicleDemo {
    public static void main(String[] args){

        int range; 
        
        // New van
        Vehicle minivan = new Vehicle();
        
        // Assign values to fields in minivan
        minivan.passengers = 7; 
        minivan.fuelcap = 16; 
        minivan.mpg = 21; 

        range = minivan.fuelcap * minivan.mpg;
        
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);
    }
    
}
