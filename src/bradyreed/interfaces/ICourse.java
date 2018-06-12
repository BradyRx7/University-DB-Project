/*
 * Brady Reed
 * Umass Lowell INFO3010
 */
package bradyreed.interfaces;

import bradyreed.baseclasses.Classroom;
import java.util.*;

/**
 * Course Interface
 *
 * Comments: Contains all methods to create a course object
 * 
 * Variables: name - String
 * address - String
 * socialSecurityNumber – String (9 digits)
 * dateOfBirth – GregorianCalendar
 *
 **/

public interface ICourse {
    
    Classroom getClassRoom();
    void setClassRoom(Classroom classRoom);

    String getCourseName(); 
    void setCourseName(String courseName);

    String getCourseId();
    void setCourseId(String courseId);
   
}
