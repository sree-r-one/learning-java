package people;

import java.util.ArrayList;

/**
 * Represents a person
 */
public class Person {

    // Instance variables

    /**
     * Name of person
     */
    private String name;

    // Constructors

    // Getters and Setters

    /**
     * Gets the name of the person
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the person
     * 
     * @param name of the person to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        // Create list for people
        ArrayList<Person> people = new ArrayList<Person>();

        Person person = new Person();
        person.setName("Sree");
        people.add(person);

        // Get the first person in the list and get their name
        String firstName = people.get(0).getName();
        int firstNameLength = firstName.length();
        System.out.println(firstName + " has a length of " + firstNameLength);

    }

}
