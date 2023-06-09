package list_demo;

import model.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {

    public ArrayList<Employee> createEmployeeList(){

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        Employee employee1 = new Employee(12,"Ankit","IT",200000.21);
        Employee employee2 = new Employee(13,"Amit","Finance",21212.23);
        Employee employee3 = new Employee(111,"Rahul","IT",23432.11);

        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);

        return employeeArrayList;


    }

    public static void main(String[] args) {

        EmployeeArrayList obj = new EmployeeArrayList();
       ArrayList<Employee> employeeArrayList = obj.createEmployeeList();

       for(int i = 0 ; i< employeeArrayList.size(); i++ ){
           System.out.println("Employee ID " + employeeArrayList.get(i).getEmpId() + " Employee Name " +employeeArrayList.get(i).geteName()
                                + " Employee Division " + employeeArrayList.get(i).geteDivision() + " Employee Salary " + employeeArrayList.get(i).getSalary() );
       }

    }
}
