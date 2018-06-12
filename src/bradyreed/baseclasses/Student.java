/*
 * Brady Reed
 * Umass Lowell INFO3010
 */
package bradyreed.baseclasses;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.ArrayList;




/**
 * Student Class (extends Person class)
 *
 * Comments:  Adds student information to a person object: GPA, graduation date,
 *              and a list of enrolled courses
 * 
 * Variables: private float currentGPA, private GregorianCalendar
 *            dateOfGraduation, private ArrayList<StudentCourse> enrolledCourses 
 *
 **/
public class Student extends bradyreed.baseclasses.Person {
    
    private float currentGPA;
    private GregorianCalendar dateOfGraduation;
    private ArrayList<StudentCourse> enrolledCourses;
    private Person person;

    public Student() {
        this.currentGPA = Float.MIN_VALUE;
        this.dateOfGraduation = new GregorianCalendar(1900, 1, 1);
        this.enrolledCourses = new ArrayList<>();
        this.person = new Person();
    }

    public float getCurrentGPA() {
        return currentGPA;
    }

    public void setCurrentGPA(float currentGPA) {
        this.currentGPA = currentGPA;
    }

    public GregorianCalendar getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(GregorianCalendar dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    public ArrayList<StudentCourse> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(ArrayList<StudentCourse> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public String getGradDateString() {
        String dateString = dateToString(getDateOfGraduation());
        return dateString;
    }
   
    private String dateToString(GregorianCalendar cal) {
        String simpleDate;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy MM dd");
        simpleDate = formatter.format(cal.getTime());
        return simpleDate;
    }
    
    @Override
    public String toString() {
        return "Student{" + "Name= " + getName() +
                ", Address= " + getAddress() + 
                ", SSN= " + getSSN() + 
                ", DOB= " + getDOBString() +
                ", GPA= " + currentGPA +
                ", Date Of Graduation= " + getGradDateString() +
                ", Enrolled Courses= " + enrolledCourses.toString() + '}';
    }
    
    
}
