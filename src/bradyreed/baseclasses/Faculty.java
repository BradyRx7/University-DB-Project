/*
 * Brady Reed
 * Umass Lowell INFO3010
 */
package bradyreed.baseclasses;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.ArrayList;

/**
 * Faculty Class
 *
 * Comments: Adds additional information to a person object to make it
 *              a faculty object. Includes date of hire, date of termination,
 *              full/part time status, salary, 
 *              and courses taught (listOfCourses)
 * 
 * Variables: private GregorianCalendar dateOfHire, private GregorianCalendar
 *              dateOfTermination, private String status, private double salary
 *              private ArrayList<FacultyCourse> listOfCourses
 *
 */

public class Faculty extends bradyreed.baseclasses.Person {
    
    private GregorianCalendar dateOfHire;
    private GregorianCalendar dateOfTermination;
    private String status;
    private double salary;
    private ArrayList<FacultyCourse> listOfCourses;
    private Person person;

    public Faculty() {
        this.dateOfHire = new GregorianCalendar(1900, 0, 1);
        this.dateOfTermination = new GregorianCalendar(1900, 0, 1);
        this.status = "";
        this.salary = 0;
        this.listOfCourses = new ArrayList<>(6);
        this.person = new Person();
    }

    public GregorianCalendar getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(GregorianCalendar dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public GregorianCalendar getDateOfTermination() {
        return dateOfTermination;
    }

    public void setDateOfTermination(GregorianCalendar dateOfTermination) {
        this.dateOfTermination = dateOfTermination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<FacultyCourse> getListOfCourses() {
        return listOfCourses;
    }

    public void setListOfCourses(ArrayList<FacultyCourse> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }
    
    public String getTerminationDateString() {
        String dateString = dateToString(getDateOfTermination());
        return dateString;
    }
    
    public String getHireDateString() {
        String dateString = dateToString(getDateOfHire());
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
        return "Faculty{" + "Name= " + getName() + ", Address= " + getAddress() + 
                ", SSN= " + getSSN() + 
                ", DOB= " + getDateOfBirth().getTime() +
                ", Hire Date= " + dateOfHire.getTime() +
                ", Termination Date= " + dateOfTermination.getTime() + 
                ", Employ status= " + status + ", Salary= " + salary + 
                ", Courses Taught= " + listOfCourses.toString() + '}';
    }
}
