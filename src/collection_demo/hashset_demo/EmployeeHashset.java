package collection_demo.hashset_demo;

import model.Employee;

import java.util.HashSet;

public class EmployeeHashset {

    public HashSet<Employee> createEmployeeHashset(){

        HashSet<Employee> employeeHashSet = new HashSet<>();
        Employee employee1 = new Employee(1001,"Ankit","IT",200121.12);
        Employee employee2=new Employee( 1002,"Ram","Finance" ,123223.32);
        Employee employee3 = new Employee(1003,"Rahul","Admin",121212.12);
        Employee employee4 = new Employee(1001,"Ankit","IT",200121.12);
        Employee employee5=new Employee( 1002,"Ram","Finance" ,123223.32);
        Employee employee6 = new Employee(1003,"Rahul","Admin",121212.12);

        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);
        employeeHashSet.add(employee6);

        System.out.println("Hashcode of employee 1 : " + employee1.hashCode());
        System.out.println("Hashcode of employee 2 : " + employee2.hashCode());
        System.out.println("Hashcode of employee 3 : " + employee3.hashCode());
        System.out.println("Hashcode of employee 4 : " + employee4.hashCode());
        System.out.println("Hashcode of employee 5 : " + employee5.hashCode());
        System.out.println("Hashcode of employee 6 : " + employee6.hashCode());



        return employeeHashSet;
    }


    public static void main(String[] args) {

        EmployeeHashset obj =new EmployeeHashset();
        HashSet<Employee> employeeHashSet = obj.createEmployeeHashset();
        for(Employee var : employeeHashSet){
            System.out.println("Emp id : " +var.getEmpId()+" ,Emp name :"+ var.geteName()+ " , Emp Dept " + var.geteDivision() +
                    " ,Emp Salary " + var.getSalary() );
        }

    }
}
