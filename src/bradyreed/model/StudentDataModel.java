/*
 * Brady Reed
 * Umass Lowell INFO3010
 */
package bradyreed.model;

import bradyreed.baseclasses.Student;
import bradyreed.baseclasses.StudentCourse;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.FileOutputStream;
import java.io.File;

import bradyreed.utilities.Logger;
import java.util.GregorianCalendar;


/**
 *
 * @author brady
 */
public class StudentDataModel {
    
    
    private ArrayList<Student> listOfStudents = new ArrayList<>();

   
     // no-arg constructor
    public StudentDataModel() {
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
 
    public void writeXML(ArrayList<Student> pStudentList) {

      //get an instance of the document builder factory
      DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();

      try {
          //get an instance of builder
          DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();

          //create an instance of the document model
          Document docDataModel = docBuilder.newDocument();

          //create the docDataRootElement element <Person> and append to document
          Element docDataRootElement = docDataModel.createElement("person");
          docDataModel.appendChild(docDataRootElement);

          // create the individual pieces of a student

          // Name
          Element nameElement = docDataModel.createElement("name");
          Text nameText = docDataModel.createTextNode(pStudentList.get(0).getName());
          nameElement.appendChild(nameText);
          docDataRootElement.appendChild(nameElement);

          // Address
          Element addressElement = docDataModel.createElement("address");
          Text addressText = docDataModel.createTextNode(pStudentList.get(0).getAddress());
          addressElement.appendChild(addressText);
          docDataRootElement.appendChild(addressElement);

          // ssn
          Element ssn = docDataModel.createElement("ssn");
          Text ssnTxt = docDataModel.createTextNode(pStudentList.get(0).getSSN());
          ssn.appendChild(ssnTxt);
          docDataRootElement.appendChild(ssn);

          // dob
          Element dob = docDataModel.createElement("dob");
          Text dob_text = docDataModel.createTextNode(pStudentList.get(0).getDOBString());
          dob.appendChild(dob_text);
          docDataRootElement.appendChild(dob);
          
          //GPA
          Element gpa = docDataModel.createElement("GPA");
          Text gpa_text = docDataModel.createTextNode(pStudentList.get(0).getDOBString());
          gpa.appendChild(gpa_text);
          docDataRootElement.appendChild(gpa);
          
          //Grad date
          Element gradDate = docDataModel.createElement("grad_date");
          Text gradDate_text = docDataModel.createTextNode(pStudentList.get(0).getGradDateString());
          gradDate.appendChild(gradDate_text);
          docDataRootElement.appendChild(gradDate);
          
          //Enrolled Courses
          Element courses = docDataModel.createElement("courses");
          Text courses_text = docDataModel.createTextNode(pStudentList.get(0).getEnrolledCourses().toString());
          courses.appendChild(courses_text);
          docDataRootElement.appendChild(courses);
          
          // now that we have al the pieces of a person in the document, write
          // it out to a file

          // use default xml formatting in the file
          OutputFormat format = new OutputFormat(docDataModel);
          format.setIndenting(true);

          // open the output stream
          XMLSerializer serializer = new XMLSerializer(
          new FileOutputStream(new File("student.xml")), format);

          // write out the object
          serializer.serialize(docDataModel);

      } catch(Exception pce) {
        System.out.println(pce.getMessage());
      }
     }
    
    /**
     * Commented out to be fixed later on
     * 
    public static ArrayList<Student> readXML() {

        ArrayList<Student> listOfStudents = new ArrayList<>();
            
        // Get the factory instance
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();

        //Using factory, get an instance of document builder
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();

        //Use the builder to get DOM representation of the XML file
        // DOM - the Document Object Model
        // if wrong file name is entered, let Main Menu handle it
        Document xmlDocument = docBuilder.parse("student.xml");

        //get the root elememt (student)
        Element list_of_students = xmlDocument.getDocumentElement();

        //retrieve the list of students from the root of the document
        NodeList studentList = list_of_students.getElementsByTagName("student");
        
        //get a list of elements under the student element
        NodeList nodeList = list_of_students.getChildNodes();
        
        
         //If you want to see what you're getting, log it!
         for (int i = 0; i < nodeList.getLength(); i++) {
         Logger.logInfo(nodeList.item(i).getTextContent());
         }

        // get the child nodes under the student node
        String nameNode = nodeList.item(0).getNodeValue();
        String addressNode = nodeList.item(1).getNodeValue();
        String ssnNode = nodeList.item(2).getNodeValue();
        String dobNode = nodeList.item(3).getNodeValue();
        String gpaNode = nodeList.item(4).getNodeValue();
        String gradDateNode = nodeList.item(5).getNodeValue();
        String coursesNode = nodeList.item(6).getNodeValue();

        //loop through the list of students and create student objects            
        for (int i = 0; i < studentList.getLength(); i++) {

            //get a student element from the list
           Element studentElement = (Element) studentList.item(i);

            //create a temporary student object
            Student newStudent = new Student();
            
            //Retrieve the text from the student data fields for the element in the file
            
            NodeList studentNameList = studentElement.getElementsByTagName(nameNode);
            String studentName = studentNameList.item(0).getTextContent();
            
            NodeList studentAddressList = studentElement.getElementsByTagName(addressNode);
            String studentAddress = studentNameList.item(0).getTextContent();
            
            NodeList studentSSNList  = studentElement.getElementsByTagName(ssnNode);
            String studentSSN = studentNameList.item(0).getTextContent();
            
            NodeList studentDOBList  = studentElement.getElementsByTagName(dobNode);
            String studentDOB = studentNameList.item(0).getTextContent();
            
            NodeList studentGPAList  = studentElement.getElementsByTagName(gpaNode);
            float studentGPA = Float.parseFloat(studentNameList.item(0).getTextContent());
            
            NodeList studentGradDateList = studentElement.getElementsByTagName(gradDateNode);
            String studentGradDate = studentNameList.item(0).getTextContent();
            
            NodeList studentCoursesList = studentElement.getElementsByTagName(coursesNode);
            String studentCourses = studentNameList.item(0).getTextContent();
            
            //set data in student object
            newStudent.setName(studentName);
            newStudent.setAddress(studentAddress);
            newStudent.setCurrentGPA(studentGPA);
            
            String dateStringArray[] = studentDOB.split(" ");
            int dateInts[] = new int[3];
            for (i = 0; i<3; i++)
                dateInts[i] = Integer.parseInt(dateStringArray[i]);
                    
            newStudent.setDateOfBirth(new GregorianCalendar(dateInts[0], dateInts[1], dateInts[2]));
            
            dateStringArray = new String[3];
            dateStringArray = studentGradDate.split(" ");
            dateInts = new int[3];
            for (i = 0; i<3; i++)
                dateInts[i] = Integer.parseInt(dateStringArray[i]);
                    
            newStudent.setDateOfGraduation(new GregorianCalendar(dateInts[0], dateInts[1], dateInts[2]));
            
            //Parse course data from the XML file, no idea how,
            //but it involves a loop after reading the data from the XML file
            //it has to do with reading the string data into an arrayList<StudentCourse>
            //but i cannot figure out how to do the parsing of that string data
        
            
//            StudentCourse sCourse = new StudentCourse();
//             for (i = 0; i < num of Courses); i++) {
    //             sCourse.setCourseGrade();
    //             sCourse.setCourseId();
    //             setEnrolledCourses();
               }

            

            //add the classroom to the data model arraylist
        try {
            listOfStudents.add(newStudent);
        
         } // if wrong file name is entered, let Main Menu handle it
        catch (Exception exp) {
            Logger.logError(exp.getMessage());
        } finally {
            return listOfStudents;
        } 

            

            // Re-constitute a person
            try {
            Student rStudent = new Student();
            rStudent.setName(name.getNodeValue());
            rStudent.setAddress(address.getNodeValue());
            rStudent.setSSN(ssn.getNodeValue());
            
            }
        
            catch (Exception e) {
            Logger.logError(e.getMessage());
            }
        }    
    }
    
    */
}