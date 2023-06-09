package list_demo;

import com.sun.source.tree.NewArrayTree;
import model.Doctor;

import javax.print.Doc;
import java.util.ArrayList;

public class DoctorArrayList {

    public ArrayList<Doctor> crateDoctorArrayList(){
        ArrayList<Doctor> doctorArrayList = new ArrayList<>();
        Doctor doctor1 = new Doctor(101,"Harish","Bajaj");
        Doctor doctor2 = new Doctor(102,"Yogesh","DBH");
        Doctor doctor3 = new Doctor(103,"Abhi","AIIMS");

        doctorArrayList.add(doctor1);
        doctorArrayList.add(doctor2);
        doctorArrayList.add(doctor3);

        return doctorArrayList;

    }

    public static void main(String[] args) {
        DoctorArrayList obj = new DoctorArrayList();
       ArrayList<Doctor> doctorArrayList = obj.crateDoctorArrayList();
       doctorArrayList.get(0).setDrName("Vijay");
       for (int i = 0 ; i < doctorArrayList.size();i++){
           System.out.println("Doctor Id: "+ doctorArrayList.get(i).getId() + " Doctor Name : " + doctorArrayList.get(i).getDrName() +
                                " Hospital Name :" + doctorArrayList.get(i).getHospital());
       }
    }
}
