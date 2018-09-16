import java.util.*;

class student{
    int ID;
    String formattedID = String.format("%04d", ID);
    String lastName;
    String course1, course2, course3, course4;

    //Constructor options: a student has anywhere from 2 to 4 courses

    //student with two courses
    public student(int sID, String sLastName, String sCourse1, String sCourse2){
        ID = sID;
        lastName = sLastName;
        course1 = sCourse1;
        course2 = sCourse2;
    }
    //student with three courses
    public student(int sID, String sLastName, String sCourse1, String sCourse2, String sCourse3){
        ID = sID;
        lastName = sLastName;
        course1 = sCourse1;
        course2 = sCourse2;
        course3 = sCourse3;
    }
    //student with 4 courses
    public student(int sID, String sLastName, String sCourse1, String sCourse2, String sCourse3, String sCourse4){
        ID = sID;
        lastName = sLastName;
        course1 = sCourse1;
        course2 = sCourse2;
        course3 = sCourse3;
        course4 = sCourse4;
    }

    //getters and setters
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        ID = this.ID;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        lastName = this.lastName;
    }

    public String getCourse1(){
        return course1;
    }
    public void setCourse1(String course1){
        course1 = this.course1;
    }

    public String getCourse2(){
        return course2;
    }
    public void setCourse2(String course2){
        course2 = this.course2;
    }

    public String getCourse3(){
        return course3;
    }
    public void setCourse3(String course3){
        course3 = this.course3;
    }

    public String getCourse4(){
        return course4;
    }
    public void setCourse4(String course4){
        course4 = this.course4;
    }

    //checking if student has 3 or 4 courses, if so then append them with the
    // proper punctuation
    public String checkCourse3(){
        if (course3 == null) course3 = "";
        else course3 = ", " + course3;

        return course3;
    }
    public String checkCourse4(){
        if (course4 == null) course4 = "";
        else course4 = ", " + course4;

        return course4;
    }

    public String toString(){
        //formatting ID so it has up to 4 leading 0's
        String formatID = String.format("%04d", ID);

        checkCourse3();
        checkCourse4();

        return formatID + ",\t" + lastName + "\t\t" + course1 + ", " + course2 + course3 + course4;
    }
}

    /**
        Assigns students ID, Name, and Courses. Adds students arrayList.
        Sorts list of students
    **/
    public class studentTest{
        public static ArrayList<student> studentList = new ArrayList<student>();

        static student student1;
        static student student2;
        static student student3;
        static student student4;
        static student student5;
        static student student6;
        static student student7;
        static student student8;
        static student student9;
        static student student10;
        static student student11;
        static student student12;
        static student student13;
        static student student14;
        static student student15;


        public static void createStudents(){

            student1 = new student(1337, "Alderson", "CNT4513", "CNT4503", "CNT4403", "CNT4603");
            student2 = new student(0007, "Baelish", "COP4814", "CNT4503", "CNT4603");
            student3 = new student(0010, "Hendrix", "CNT4513", "COP4814", "CNT4603");
            student4 = new student(0011, "Lannister", "COP4814", "CNT4503", "CNT4603");
            student5 = new student(0054, "Mulder", "CNT4603", "COP4814", "CNT4403");
            student6 = new student(0077, "Ripley", "CNT4503", "CNT4513", "COP4814");
            student7 = new student(0025, "Rose", "COP4814", "CNT4403", "CNT4503");
            student8 = new student(0005, "Schmidt", "COP4814", "CNT4513");
            student9 = new student(0034, "Scully", "COP4814", "CNT4403", "CNT4503", "CNT4513");
            student10 = new student(0004, "Smith", "CNT4503", "COP4814", "CNT4403");
            student11 = new student(0045, "Snow", "CNT4513", "COP4814", "CNT4503");
            student12 = new student(0001, "Solo", "COP4814", "CNT4603", "CNT4503");
            student13 = new student(0002, "Stark", "CNT4513", "CNT4503", "CNT4603");
            student14 = new student(0006, "Tyrell", "COP4814", "CNT4603", "CNT4403");
            student15 = new student(0033, "Wrynn", "CNT4503", "COP4814", "CNT4403");

            //adding students to studentList
            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);
            studentList.add(student4);
            studentList.add(student5);
            studentList.add(student6);
            studentList.add(student7);
            studentList.add(student8);
            studentList.add(student9);
            studentList.add(student10);
            studentList.add(student11);
            studentList.add(student12);
            studentList.add(student13);
            studentList.add(student14);
            studentList.add(student15);
            //TRY TO IMPLEMENT THIS DOING FOR LOOP BEFORE SUBMITTING

        }
        public static void main(String args[]){

            createStudents();
            for (student x:studentList) System.out.println(x);
        }
    }
