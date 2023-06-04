package collection_demo;

import java.util.ArrayList;

public class DemoCollection {

    public void storeInformation(){
        String city1 ="Agra";
        String city2 = "Pune";
        String city3 = "Delhi";
        String city4 = "Tundla";

        //TODO Syntax: CollectionName objName = new CollectionName();

        ArrayList list =new ArrayList();
        list.add("Agra");       // 0 index
        list.add("Pune");       // 1 index
        list.add("Delhi");      // 2 index
        list.add("Tundla");     // 3 index
        list.add(33);     // 4 index
        list.add(34.56);     // 5 index
        System.out.println("Reading List at 3 index : = " +list.get(3));
        System.out.println("Reading List at 0 index : = " +list.get(0));
        System.out.println("Reading List at 1 index : = " +list.get(1));
        System.out.println("Reading List at 4 index : = " +list.get(4));
        System.out.println("Reading List at 5 index : = " +list.get(5));

        for(int i =0; i< list.size(); i++){
            System.out.println("Printing list in loop  : = " +list.get(i));
        }

        // Advance for loop (DataType var : array/collection)(code)

        for(Object var:list){
            System.out.println("Advanced for Loop : " +var);
        }

        list.remove(2);
        for(Object var:list){
            System.out.println("Advanced for Loop After Removal : " +var);
        }

        System.out.println("Reading list at 3 index : " +list.get(3));
    }

    public static void main(String[] args) {

        DemoCollection obj = new DemoCollection();
        obj.storeInformation();



    }
}
