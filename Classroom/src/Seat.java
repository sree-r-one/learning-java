public class Seat {

    // Instance variables

    /**
     * Seat Row 
     */
    int row; 

    /**
     * Seat Column 
     */
    int column;

    /**
     * Student assigned to the seat, otherwise null
    */
    Student assignedStudent;

    //   Constructor 
    public Seat(int row, int column){
        this.row = row; 
        this.column = column; 
    }

    // Methods 

    /**
     * Assigns given student to a seat
     * @param student to assign
     */
    public void assignStudentToSeat(Student student){
        this.assignedStudent = student;
    }

    // String representation of the class 
    public String toString(){
        return this.row + " " +this.column + " " + this.assignedStudent;
    }
}
