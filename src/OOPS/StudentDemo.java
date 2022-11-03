package OOPS;

public class StudentDemo {

 public    String StudentName;
  public   String StdentRoll;
 public    String StudentDOB;
 public StudentDemo(){

 }
 public StudentDemo(String SN,String SR,String SD){
this.StudentName=SN;
     this.StdentRoll=SR;
     this.StudentDOB=SD;

 }
 public StudentDemo(String SR,String SD){
     this.StdentRoll=SR;
     this.StudentDOB=SD;
 }
 public StudentDemo(String SN){
     this.StudentName=SN;

 }
}