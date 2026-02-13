import java.sql.SQLOutput;
import java.sql.Statement;

class Course {
    String courseName;
    String enrolledStudent;
    int RollNo;
    static int maxCapacity;
    boolean isEnrolled;
    static {
        maxCapacity = 0;
    }
    {
        maxCapacity++;
    }
    Course(int RollNo, String courseName,String enrolledStudent){
        this.RollNo = RollNo;
        this.courseName= courseName;
        this.enrolledStudent = enrolledStudent;
    }
    Course(int rollNo){
        this(rollNo,"Unknown","Unknown");
    }
    static int totalStudents(){
        return maxCapacity;
    }
    void enrolledStudent(String enrolledStudent){
        if (isEnrolled){
            System.out.println("Student is Already Enrolled in This Course");
        }
        else {
            this.isEnrolled = true;
            System.out.println(this.enrolledStudent+" is Successfully Enrolled");
        }
    }
    static int totalNoOfStudent(){
        return maxCapacity;
    }
    void unEnrolledStudent(){
        if(isEnrolled){
            this.isEnrolled = false;
            System.out.println("Hope You Enjoy the Course As well As");
        }else {
            System.out.println("This Student is Already Enroll in this Course");
        }
    }

    static void main(String[] args) {
        Course Kartikey = new Course(73,"Computer Science","Kumar Kartikey");
        System.out.println(Kartikey.enrolledStudent);
        System.out.println(Course.totalNoOfStudent());
       Kartikey.enrolledStudent("Kartikey");
       Kartikey.unEnrolledStudent();
       Kartikey.enrolledStudent("kartikey");
    }
}
