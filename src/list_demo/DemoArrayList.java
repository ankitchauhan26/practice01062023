package list_demo;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;

public class DemoArrayList {

    // it will create String Array list

  /*  TODO: Syntax
        ArrayList <DataType> objName = new ArrayList<>();

   */

    public ArrayList<String> createStringList(){
        ArrayList <String> course  = new ArrayList<>();
        course.add("CS");
        course.add("Java");
        course.add("Spring");
        course.add("Spring Boot");       // course.add(12); we cannot add integer type data   or any other type of data
        course.add("Cloud");
        course.add("Spring Boot");
        course.add("Cloud");
        return course;
    }

    // int ArrayList

    public ArrayList<Integer> numberAdd(){
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(12);
        marks.add(32);
        marks.add(45);
        marks.add(67);
        marks.add(89);
        return marks;
    }

    public ArrayList<Double> empSalary(){
        ArrayList<Double> salary = new ArrayList<>();
        salary.add(23033.34);
        salary.add(12345.21);
        salary.add(21213.332);

        return salary;
    }


    public static void main(String[] args) {

        DemoArrayList obj = new DemoArrayList();
          ArrayList<String> course = obj.createStringList();

          for(String var:course){
              System.out.println("Printing ArrayList in Loop : " +var);
          }

         ArrayList<Integer> marks = obj.numberAdd();

          for(Integer num:marks){
              System.out.println("Total marks of Student : " +num);
          }

          ArrayList<Double> salary = obj.empSalary();

          for(Double sal:salary){
              System.out.println("employee Salary is : " +sal);
          }

          //Traditional For Loop

          for(int i = 0; i< salary.size();i++){
              System.out.println("Employee Salary is using Traditional For Loop: " + salary.get(i));
          }


    }
}
