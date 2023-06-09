package collection_demo.hashset_demo;

import model.Student;

import java.util.HashSet;

public class StudentHashSet {

    public HashSet<Student> createStudentHashSet(){
        HashSet<Student> studentHashset = new HashSet<>();
        Student student1 = new Student(1,"Ankit","CS");
        Student student2=new Student(2,"Ravi","civil");
        Student student3 =new Student(3,"Vijay","EC");
        Student student4 = new Student(1,"Ankit","CS");
        Student student5=new Student(2,"Ravi","civil");
        studentHashset.add(student1);
        studentHashset.add(student2);
        studentHashset.add(student3);
        studentHashset.add(student4);
        studentHashset.add(student5);

        return studentHashset;

    }


    public static void main(String[] args) {

        StudentHashSet obj = new StudentHashSet();
        HashSet<Student> studentHashset = obj.createStudentHashSet();
        for(Student var:studentHashset){
            System.out.println("Printing.... RollNo.: "+var.getRollNo()+" ,Name :"+var.getName()+" ,Branch : " + var.getBranch());
        }
    }
}
