/*
 * Brady Reed
 * Umass Lowell INFO3010
 */
package bradyreed.baseclasses;

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
/**
 * Person Class
 *
 * Comments: Creates a person object with name, address, Social Security number,
 *              and date of birth (as a Gregorian Calendar object)
 * 
 * Variables:name - String
 * address - String
 * socialSecurityNumber – String (9 digits)
 * dateOfBirth – GregorianCalendar
 *
 **/

public class Person implements bradyreed.interfaces.IPerson {
   
    private String name;       
    private String address;
    private String socialSecurityNumber;
   
    // Uses int (Year, Month, Day) format. Uses set method for changing date
    private GregorianCalendar dateOfBirth;    
    
    
    public Person() {
       name = address = "";
       socialSecurityNumber = "000000000";
       dateOfBirth = new GregorianCalendar(1900, 0, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String argName) {
        this.name = argName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSSN() {
        return socialSecurityNumber;
    }

    public void setSSN(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar cal) {
        this.dateOfBirth = cal;
    }
    
    public String getDOBString() {
        String dateString = dateToString(getDateOfBirth());
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
        return "Person{" + "Name= " + name + ", Address= " + address + 
                ", SSN= " + socialSecurityNumber + 
                ", DOB= " + getDOBString() + '}';
    }
            
}
