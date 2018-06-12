/*
 * Brady Reed
 * Umass Lowell INFO3010
 */
package bradyreed.baseclasses;

/**
 * StudentCourse Class
 *
 * Comments: 
 * 
 * Variables:
 * 
 */

public class StudentCourse extends bradyreed.baseclasses.OfferedCourse
        implements bradyreed.interfaces.ICourse {
    
    private double courseGrade;
    
    // Default Constructor: no values
    public StudentCourse() {
        this.setCourseId("000000");
        this.courseGrade = Double.MIN_VALUE;
    }   
    
    // Overloaded Constructor: all 2 variables
    public StudentCourse(String p_courseId, double p_courseGrade) {
        this.setCourseId(p_courseId);
        this.courseGrade = p_courseGrade;
    }

    // Overloaded Constructor: first variable only
    public StudentCourse(String p_courseId) {
        this.setCourseId(p_courseId);
        this.courseGrade = Double.MIN_VALUE;
    }
   
//    public String getCourseId() {
//        return courseId;
//    }
//
//    public void setCourseId(String courseId) {
//        this.courseId = courseId;
//    }

    public double getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(double courseGrade) {
        this.courseGrade = courseGrade;
    }

    @Override
    public String toString() {
        return "StudentCourses{" + "Course Id= " + getCourseId() +
                ", Course Grade= " + String.valueOf(courseGrade) + '}';
    }
    
    
}
