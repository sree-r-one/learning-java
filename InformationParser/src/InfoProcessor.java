import java.util.ArrayList;

/**
 * Class to process and extract information from a list of lines
 */
public class InfoProcessor {

    // Variables

    /**
     * List of lines to process
     */
    ArrayList<String> lines = new ArrayList<String>();

    // Constructor

    /**
     * Creates InfoProcessor with given list of lines
     * 
     * @param lines to process
     */
    public InfoProcessor(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * Gets course Name from a list of lines
     * 
     * @return couseName
     */
    public String getCourseName() {
        return getNextStringStartsWith("Course:");
    }

    /**
     * Gets the course ID from a list of lines
     * 
     * @return courseID
     */
    public int getCourseID() {
        String strCourseID = getNextStringStartsWith("CourseID");
        int courseID = Integer.parseInt(strCourseID);
        return courseID;
    }

    /**
     * Gets Student ID from a list of lines
     * 
     * @return
     */
    public int getStudentId() {
        String strStudentID = getNextStringStartsWith("StudentID");
        int studentID = Integer.parseInt(strStudentID);
        return studentID;
    }

    /**
     * 
     * @param str to look for in lines
     * @return String from the very next line
     */
    String getNextStringStartsWith(String string) {

        for (int i = 0; i < lines.size() - 1; i++) {
            if (lines.get(i).startsWith(string)) {
                return lines.get(i + 1);
            }
        }

        return null;
    }

}
