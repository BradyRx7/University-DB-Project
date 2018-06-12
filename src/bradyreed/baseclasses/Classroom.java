package bradyreed.baseclasses;

import bradyreed.interfaces.IClassroom;

/**
 * Use this class to create Classrooms. Each classroom should contain a
 * room number and room type.
 *
 * Room types can be any of the following from the enumerated list below:
 * 1) Lab 
 * 2) Classroom 
 * 3) Lecture Hall
 *
 */
import java.io.Serializable;

public class Classroom implements IClassroom, Serializable {
    
    private String roomNumber;
    private Room typeOfRoom;

    
    public enum Room {
        LAB, CLASSROOM, LECTURE_HALL
    }
    
    // Default no-arg constructor, assume some default values
    public Classroom() {
        roomNumber = "000";
        typeOfRoom = Room.CLASSROOM;
    }

    // Overloaded constructor
    public Classroom(String number, Room typeOfRoom) {
        this.roomNumber = number;
        this.typeOfRoom = typeOfRoom;
    }
    
    public Classroom(String number) {
        this.roomNumber = number;
        this.typeOfRoom = Room.CLASSROOM;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public Room getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setTypeOfRoom(Room typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }
    
    @Override
    public String toString() {
        return "Classroom{" + " Room #= " + roomNumber + ", Type of Room= " 
                + typeOfRoom.name() + '}';
    }   

}
