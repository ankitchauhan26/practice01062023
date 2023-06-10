package model;

import java.util.Objects;

public class Student {
    // Data Member
    int rollNo;
    String name;
    String branch;

    //parameterized Constructor


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getRollNo() == student.getRollNo() && Objects.equals(getName(), student.getName()) && Objects.equals(getBranch(), student.getBranch());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRollNo(), getName(), getBranch());
    }

    public Student(int rollNo, String name, String branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
    }

    // getter and setter method


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
