package model;

public class Employee {

    int empId;
    String eName;
    String eDivision;
    double salary;

    public Employee(int empId, String eName, String eDivision, double salary) {
        this.empId = empId;
        this.eName = eName;
        this.eDivision = eDivision;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteDivision() {
        return eDivision;
    }

    public void seteDivision(String eDivision) {
        this.eDivision = eDivision;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
