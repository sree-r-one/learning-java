public class Animal {

    // static variables

    /**
     * Default age of the animal
     */
    static int DEFAULT_AGE = 0;

    // instance variables 

    /**
     * Age of the animal
     */
    int age; 

    /**
     * Weight of the animal
     */
    double weight;

    /**
     * Name of the animal 
     */
    String name; 

    // constructors

    /**
     * Creates an animal with a given age
     * @param age of the animal
     */
    public Animal(int age){
        this.age = age;
    }

    public Animal(){
        // Calls first constructor with the default value 
        this(Animal.DEFAULT_AGE);
    }

    // getters and setters

    /**
     * Gets the name of the animal
     * @return name of the animal
     */
    public String getName(){
        return this.name;
    }

    /**
     * Sets name of the animal
     * @param name
     */
    public void setName(String name){
        this.name = name; 
    }

    /**
     * Animal speaks
     */
    public void speak(){
        System.out.println("Animal says hi");
    }

    /**
     * Overrides the toString Object class 
     * Returns the name of the animal class for printing 
     */
    @Override
    public String toString(){
        return this.name;
    }
}
