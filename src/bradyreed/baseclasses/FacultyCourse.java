/*
 * Brady Reed
 * Umass Lowell INFO3010
 */
package bradyreed.baseclasses;

import bradyreed.interfaces.ICourse;

/**
 * FacultyCourse Class
 *
 * Comments: Creates an object for faculty teaching a course. This maps back
 *              to the courseId from the offered course object
 * 
 * Variables: private String courseId
 */


public class FacultyCourse extends bradyreed.baseclasses.OfferedCourse implements ICourse {
    
    private String courseId;
    
    // Default no values constructor
    public FacultyCourse() {
        this.courseId = "000000";
    }
    // Overloaded constructor w/variable
    public FacultyCourse(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }  

   @Override
    public String toString() {
        return " Course Taught{course name= " + getCourseName()
                + ", courseId= " + courseId + '}';
    }
    
}
