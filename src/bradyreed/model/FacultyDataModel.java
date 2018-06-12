/*
 * Brady Reed
 * Umass Lowell INFO3010
 */
package bradyreed.model;

import bradyreed.baseclasses.Faculty;
import java.util.ArrayList;

/**
 *
 * @author brady
 */
public class FacultyDataModel {
    
    private ArrayList<Faculty> listOfFaculty = new ArrayList<>();

   
     // no-arg constructor
    public FacultyDataModel() {
    }

    public ArrayList<Faculty> getListOfFaculty() {
        return listOfFaculty;
    }

    public void setListOfFaculty(ArrayList<Faculty> listOfFaculty) {
        this.listOfFaculty = listOfFaculty;
    }
 
}