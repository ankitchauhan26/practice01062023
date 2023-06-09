package collection_demo.hashset_demo;

import java.util.HashSet;

public class DemoHashSet {

    public HashSet<String> createHashSet(){

        // Syntax : HashSet <DataType> objectName = new HashSet<>();

        HashSet <String> cities = new HashSet<>();
        cities.add("Agra");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Pune");
        System.out.println("Size of Hashset: " +cities.size());

        return cities;
    }


    public static void main(String[] args) {
        DemoHashSet obj = new DemoHashSet();
        HashSet <String> cities = obj.createHashSet();

        for(String var:cities){

            if (var== "Delhi"){
                System.out.println("Delhi Found");
            }
            System.out.println("Cities name are = " +var);
        }



    }

}
