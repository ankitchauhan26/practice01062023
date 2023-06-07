package model;

public class Student {
    // Data Member
    int rollNo;
    String name;
    String branch;

    //parameterized Constructor


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
