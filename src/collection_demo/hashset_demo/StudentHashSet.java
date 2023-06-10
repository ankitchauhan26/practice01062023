package collection_demo.hashset_demo;

import model.Student;

import java.util.HashSet;

public class StudentHashSet {

    public HashSet<Student> createStudentHashSet(){
        HashSet<Student> studentHashset = new HashSet<>();
        Student student1 = new Student(1,"Ankit","CS");
        System.out.println("Hashset code for student 1 :" + student1.hashCode());
        Student student2=new Student(2,"Ravi","civil");
        System.out.println("Hashset code for student 2 :" + student2.hashCode());
        Student student3 =new Student(3,"Vijay","EC");
        System.out.println("Hashset code for student 3 :" + student3.hashCode());
        Student student4 = new Student(1,"Ankit","CS");
        System.out.println("Hashset code for student 4 :" + student4.hashCode());
        Student student5=new Student(2,"Ravi","civil");
        System.out.println("Hashset code for student 5 :" + student5.hashCode());
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
