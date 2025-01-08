import java.util.ArrayList;

/**
 * Represents a classroom with Students
 * Each classroom has a list of students
 * and an array that represents the seats in the classroom
 */
 public class Classroom {

    // Instance variables

    /**
     * Name of the building
     */
    String buildingName; 

    /**
     * Name of the classroom
     */
    String roomName; 

    /**
     * List of students in the classroom
     */
    ArrayList<Student> students;

    /**
     * Seats in the classroom
     */
    Seat[][] seats;

    // Constructor

    /**
     * Creates a classroom with given building name, room name, number of rows of seats, number of seats
     * @param buildingName of building
     * @param roomName of room
     * @param rows for seasts
     * @param columns for seats
     */
    public Classroom(String buildingName, String roomName, int rows, int columns){

        // Set building name 
        this.buildingName = buildingName;

        // Set room name 
        this.roomName = roomName; 

        // Populate the seats array
        this.seats= new Seat[rows][columns];

        // Populate seats array with instances of the seat class 

        // Iterate over the rows
        for (int i = 0; i < rows; i++) {
            // Iterate over the columns
            for (int j = 0; j < columns; j++) {
                // Give each location its own new instance of the seat class 
                seats[i][j] = new Seat(i, j);
            }
        }

        // Initialise the list of students
        this.students = new ArrayList<Student>();

    }

    /**
     * Add a student to the student array
     * @param student to add 
     */
    public void addAsAStudent(Student student){
        this.students.add(student);
    }

    /**
     * Finds an available seat and assigns to the student
     * @param student to assign
     */
    public void assignStudentToSeat(Student student){

        int rows = this.seats.length; 
        int columns = this.seats[0].length; 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // If the seat is not occupied, assign the seat to the student
                if (this.seats[i][j].assignedStudent == null) {
                    this.seats[i][j].assignStudentToSeat(student);
                    return;
                }
            }
        }
    }

    /** 
     * Print all students in the classroom
    */
    public void printAllStudents(){
        System.out.println("Students in Class");
        for (Student student : this.students) {
            System.out.println(student);
        }
    }

    public String toString(){
        String s = "\n"; 
        int rows = this.seats.length; 
        int columns = this.seats[0].length; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
              s += this.seats[i][j] + "\t";
            }
            s += "\n";
        }
        return s;
    }
    
    public static void main(String[] args) {
        
        // Create classroom
        Classroom huntsman = new Classroom("HH","105",10,5);

        // Create students
        Student reshu = new Student("Reshu", "G379xxxx");
        Student sree = new Student("Sree","S887xxxxx");

        // Add students to classroom 
        huntsman.addAsAStudent(sree);
        huntsman.addAsAStudent(reshu);

        // Assign students to seat
        huntsman.assignStudentToSeat(sree);
        huntsman.assignStudentToSeat(reshu);

        // Print list of all students
        huntsman.printAllStudents();

        System.out.println(huntsman);
        

        
        
    }
    
 }