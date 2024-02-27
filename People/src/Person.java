public class Person {

    // Instance variables

    /**
     * Name of the person
     */
    String name; 

    /**
     * Age of the person
     */
    int age; 

    // Constructor

    /**
     * Creates a person with name and age 
     * @param name
     * @param age
    */
    public Person(String name, int age){
        this.name = name; 
        this.age = age; 
    }

    // Methods

    /** 
     * Compares instances of Person based on name 
     * If two persons have the same name, they are equal
    */
    public boolean equals(Object something){
        // Cast given object to Person
        Person otherPerson = (Person) something;

        // returns true if names of two people are the same 
        return this.name.equals(otherPerson.name);

    }
    
}
