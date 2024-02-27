public class Student {
    // Instance variables

    /** 
     * Name of the student
    */
    String name; 

    /** 
     * ID of the student
    */
    String ID; 

    // Constructor 

    /**
     * Creates a name with a given name and ID 
     * @param name of the student
     * @param ID of the student
     */
    public Student(String name, String ID){
        this.name = name; 
        this.ID = ID;
    }

    // Methods

    // String representation of the class 

    /**
     * String representation of the class 
    */
    public String toString(){
        return this.ID + " " + this.name; 

    }
}
