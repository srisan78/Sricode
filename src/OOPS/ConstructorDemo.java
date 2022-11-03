package OOPS;

public class ConstructorDemo {
    public static void main(String[] args) {
        StudentDemo s1=new StudentDemo();
StudentDemo s2= new StudentDemo(" sri","3" ,"20/1997");
StudentDemo s3=new StudentDemo("san","2","10/2002");
StudentDemo s4=new StudentDemo("mani","3","07/2004");
        System.out.println(s2.StdentRoll);
        System.out.println(s3.StudentDOB);
        System.out.println(s4.StudentName);
    }
}
