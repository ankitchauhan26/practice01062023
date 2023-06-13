package collection_demo.hashmap_demo;

import java.util.HashMap;
import java.util.Set;

public class Demo_Dbl_INt {

    public HashMap<Double,Integer> createDblInt(){

        HashMap<Double,Integer> salary = new HashMap<>();
        salary.put(12.21,12);
        salary.put(21.111,5);
        salary.put(45.21,1);

        System.out.println("Total Salary : " + salary) ;
        return salary;
    }


    public static void main(String[] args) {

        Demo_Dbl_INt obj = new Demo_Dbl_INt();
        HashMap<Double,Integer> salary = obj.createDblInt();
        System.out.println("Total Salary " + salary.get(45.21));

        Set<Double> key = salary.keySet();
        for(Double var:key){
            System.out.println("Total Salary :" + salary.get(var));

        }

    }
}
