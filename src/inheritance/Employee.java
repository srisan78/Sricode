package inheritance;

public class Employee {

    int EmpID;
    String EmpName;
    String EmpDepartment;
    Employee Supervisor;

    public Employee(int empID, String empName) {
        EmpID = empID;
        EmpName = empName;
    }

    public Employee(int empID, String empName, String empDepartment, Employee supervisor) {
        EmpID = empID;
        EmpName = empName;
        EmpDepartment = empDepartment;
        Supervisor = supervisor;

    }

    public static void main(String[] args) {
        Employee e1=new Employee(1,"Sridhaar");
        Employee e2=new Employee(2,"muniyappa","CTM",e1);
        System.out.println(e1.EmpName);
    }
}
