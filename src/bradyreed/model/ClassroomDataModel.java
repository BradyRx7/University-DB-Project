/*
 * Brady Reed
 * Umass Lowell INFO3010
 */
package bradyreed.model;

import java.util.ArrayList;
import bradyreed.baseclasses.Classroom;


/**
 *
 * @author brady
 */
public class ClassroomDataModel {
    
    private ArrayList<Classroom> listOfClassrooms = new ArrayList<>();

   
     // no-arg constructor
    public ClassroomDataModel() {
    }

    public ArrayList<Classroom> getListOfClassrooms() {
        return listOfClassrooms;
    }

    public void setListOfClassrooms(ArrayList<Classroom> listOfClassrooms) {
        this.listOfClassrooms = listOfClassrooms;
    }
 
}

    
