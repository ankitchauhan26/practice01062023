package model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getEmpId() == employee.getEmpId() && Double.compare(employee.getSalary(), getSalary()) == 0 && Objects.equals(geteName(), employee.geteName()) && Objects.equals(geteDivision(), employee.geteDivision());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), geteName(), geteDivision(), getSalary());
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
