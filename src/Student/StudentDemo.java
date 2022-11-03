package Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1=getStudent("Sridhar","1","09/09/1998","BCA");
        Student s2=getStudent("Naveen","2","01/09/1998","BSC");
        Student s3=getStudent("Mani","3","02/09/1998","BE");
        Student s4=getStudent("Sandy","4","08/09/1997","BSC");
        System.out.println("Student Name:" +s1.studentName);
        System.out.println("Studdent RollNo:" +s1.rollNumber);
        System.out.println("Student DOB:" +s1.DOB);
        System.out.println("Student Department:" +s1.Department);
        System.out.println();
        System.out.println("Student Name:" +s2.studentName);
        System.out.println("Studdent RollNo:" +s2.rollNumber);
        System.out.println("Student DOB:" +s2.DOB);
        System.out.println("Student Department:" +s2.Department);
        System.out.println();
        System.out.println("Student Name:" +s3.studentName);
        System.out.println("Studdent RollNo:" +s3.rollNumber);
        System.out.println("Student DOB:" +s3.DOB);
        System.out.println("Student Department:" +s3.Department);
        System.out.println();
        System.out.println("Student Name:" +s4.studentName);
        System.out.println("Studdent RollNo:" +s4.rollNumber);
        System.out.println("Student DOB:" +s4.DOB);
        System.out.println("Student Department:" +s4.Department);


    }
    public static Student getStudent(String Name,String roll,String DOB,String department ){
        Student s=new Student();
        s.studentName= Name;
        s.rollNumber=roll;
        s.DOB=DOB;
        s.Department=department;
        return s;

    }
}
