package collection_demo.hashmap_demo;

import javax.security.auth.Subject;
import java.util.HashMap;
import java.util.Set;

public class DemoStringStringHashMap {

    public HashMap<String,String> createStrStr(){

        HashMap<String,String> subject = new HashMap<>();
        subject.put("VIT431","DataBase");
        subject.put("DEE 530","Windows Development");
        subject.put("DEE 555","Electronics");
        System.out.println("Printing The Map:" +subject);

        return subject;

    }

    public static void main(String[] args) {

        DemoStringStringHashMap obj = new DemoStringStringHashMap();
         HashMap<String,String> subject = obj.createStrStr();

        System.out.println("Reading Map : " +subject.get("VIT431"));

        Set<String> key = subject.keySet();
        for(String var:key){
            System.out.println("Subject Name is :" + subject.get(var) );
        }

    }
}
