package collection_demo.hashmap_demo;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

    public HashMap<Integer,String> createHashMap(){

        //SynTax HashMap<DataType_key,DataType_Value> varName = new HashMap

        HashMap<Integer,String> course = new HashMap<>();

        // adding value to Map

        course.put(1,"Java");
        course.put(2,"Spring");
        course.put(3,"Spring Boot");
        course.put(4,"Cloud");
        System.out.println("Printing Map : " +course);

        return course;
    }

    public static void main(String[] args) {

        DemoHashMap obj = new DemoHashMap();
        HashMap<Integer,String> course = obj.createHashMap();
        // get Method : get (key);

        System.out.println("Reading Map : " + course.get(3));
        System.out.println("Reading Map : " + course.get(4));

        //How to print all element of Map

        Set<Integer> keys =course.keySet();
        for(Integer var: keys){
            System.out.println("Printing Map in loop : "+course.get(var));

        }
    }
}
