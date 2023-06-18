package collection_demo.hashmap_demo;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class AdvanceHashmapDemo {

   public HashMap<String,ArrayList<Student>> createStudentInfo(){

       HashMap<String,ArrayList<Student>> studentinfo = new HashMap<>();
       ArrayList<Student> glalist = new ArrayList<>();
       ArrayList<Student> agclist = new ArrayList<>();
       ArrayList<Student> rbslist = new ArrayList<>();
       ArrayList<Student> hdtlist = new ArrayList<>();


       Student student1 = new Student(1,"Ankit","CS");

       Student student2=new Student(2,"Ravi","civil");

       Student student3 =new Student(3,"Vijay","EC");


       glalist.add(student1);
       glalist.add(student2);
       glalist.add(student3);

        student1 = new Student(1,"Aman","CS");
        student2=new Student(2,"Naman","civil");
       student3 =new Student(3,"Khaman","EC");
       agclist.add(student1);
       agclist.add(student2);
       agclist.add(student3);


       studentinfo.put("GLA",glalist);
       studentinfo.put("AGC",agclist);

       return studentinfo;
   }


    public static void main(String[] args) {

       AdvanceHashmapDemo obj = new AdvanceHashmapDemo();
        HashMap<String,ArrayList<Student>> studentinfo= obj.createStudentInfo();


        for(String var: studentinfo.keySet()){
          //  System.out.println("Printing Stundent Info : "+",College Name : " +var+" ,Student Info :" +studentinfo.get(var));

            if (var == "AGC") {
                ArrayList<Student> studentArrayList =studentinfo.get(var);
                for (Student std:studentArrayList){
                    System.out.println("GLA Student : " +std.getName()+" , Roll Number " +std.getRollNo()+ " , Branch " + std.getBranch());
                }

            }
        }

    }
}
