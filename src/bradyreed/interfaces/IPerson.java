/*
 * Brady Reed
 * Umass Lowell INFO3010
 */
package bradyreed.interfaces;

import java.util.GregorianCalendar;

/**
 * Person Interface
 *
 * Comments: Creates a person object with name, address, Social Security number,
 *              and date of birth (as a Gregorian Calendar object)
 * 
 * Variables: name - String
 * address - String
 * socialSecurityNumber – String (9 digits)
 * dateOfBirth – GregorianCalendar
 *
 **/

public interface IPerson {
         
    String getName();
    void setName(String name);
    
    String getAddress();
    void setAddress(String address);
    
    String getSSN();
    void setSSN(String socialSecurity);
    
    GregorianCalendar getDateOfBirth();
    void setDateOfBirth(GregorianCalendar cal);
   
}
