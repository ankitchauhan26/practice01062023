package collection_demo.hashset_demo;

import model.Student;

import java.util.LinkedHashSet;

public class DemoLinkedHashset {



    public static void main(String[] args) {

        LinkedHashSet<Student> studentLinkedHashSet = new LinkedHashSet<>();
        Student student1 = new Student(1,"Ankit","CS");
        Student student2=new Student(2,"Ravi","civil");
        Student student3 =new Student(3,"Vijay","EC");

        studentLinkedHashSet.add(student1);
        studentLinkedHashSet.add(student2);
        studentLinkedHashSet.add(student3);

        for(Student var:studentLinkedHashSet){
            System.out.println("Printing Student Info : " + var.getRollNo()+ " , " + var.getName()+", " + var.getBranch());
        }

    }

}
