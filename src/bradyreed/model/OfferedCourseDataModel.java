/*
 * Brady Reed
 * Umass Lowell INFO3010
 */
package bradyreed.model;

import bradyreed.baseclasses.OfferedCourse;
import java.util.ArrayList;

/**
 *
 * @author brady
 */
public class OfferedCourseDataModel {
      
    private ArrayList<OfferedCourse> listOfOfferedCourses = new ArrayList<>();

   
     // no-arg constructor
    public OfferedCourseDataModel() {
    }

    public ArrayList<OfferedCourse> getListOfOfferedCourses() {
        return listOfOfferedCourses;
    }

    public void setListOfOfferedCourses(ArrayList<OfferedCourse> listOfOfferedCourses) {
        this.listOfOfferedCourses = listOfOfferedCourses;
    }
 
}