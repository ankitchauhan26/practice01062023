package list_demo;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    // create a method which will create Student Array List

    public ArrayList<Student> createStudentList(){
        ArrayList <Student> studentArrayList =new ArrayList<>();


        // now we need to add information about students

        Student student1 = new Student(1,"Ankit","CS");
        Student student2 = new Student(2,"Mukesh","IT");
        Student student3 = new Student(3,"Rahul","EC");

        studentArrayList.add(student1);
        studentArrayList.add((student2));
        studentArrayList.add(student3);

        return studentArrayList;
    }


    public static void main(String[] args) {

        StudentArrayList obj = new StudentArrayList();
        ArrayList<Student> studentArrayList = obj.createStudentList();

        for(int i = 0;i<studentArrayList.size();i++){
            System.out.println("Printing "+ studentArrayList.get(i).getName()+ " Roll number"
                    + studentArrayList.get(i).getRollNo()+ " Branch "+ studentArrayList.get(i).getBranch() );
        }



    }
}
