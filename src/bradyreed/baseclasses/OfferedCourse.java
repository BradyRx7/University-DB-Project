/*
 * Brady Reed
 * Umass Lowell INFO3010
 */
package bradyreed.baseclasses;

/**
 * OfferedCourse Class
 *
 * Comments: Creates an object for a course catalog. This represents
 *              one course in the catalog and all information needed to 
 *              describe it: room type and number (inherited by classroom),
 *              course name, and course ID number
 * 
 * Variables: private Classroom classRoom, private String courseName,
 *            private String courseId
 */

public class OfferedCourse implements bradyreed.interfaces.ICourse {
    
    private Classroom classRoom;
    private String courseName;
    private String courseId;

    
    public OfferedCourse(String courseId, String courseName, Classroom classRoom) {
        this.classRoom = classRoom;
        this.courseName = courseName;
        this.courseId = courseId;
    }
    
    // Overloaded constructor: First variable
    public OfferedCourse(String courseId) {
        this.courseId = courseId;
        this.courseName = "";
        this.classRoom = new Classroom();
    }
    
    // Overloaded constructor: First 2 variables
    public OfferedCourse(String courseId, String courseName) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.classRoom = new Classroom();
    }
    
    // Overloaded constructor: no variables
    public OfferedCourse() {
        this.classRoom = new Classroom();
        this.courseName = "NONE";
        this.courseId = "000000";
    }

    

    public Classroom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(Classroom classRoom) {
        this.classRoom = classRoom;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return " OfferedCourse{" + "Classroom #= " 
                + classRoom.getRoomNumber() + ", Course Name= " + 
                courseName + ", Course Id= " + courseId + '}';
    }
}