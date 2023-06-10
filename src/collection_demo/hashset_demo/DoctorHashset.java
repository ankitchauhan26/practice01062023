package collection_demo.hashset_demo;

import model.Doctor;

import java.util.HashSet;

public class DoctorHashset {

    public HashSet<Doctor> doctorHashSet(){

        HashSet<Doctor> createDoctorHashSet = new HashSet<>();
        Doctor doctor1 = new Doctor(1001," Vishal" ,"AIIMS");
        Doctor doctor2 = new Doctor(1002,"Amit","SADAR");
        Doctor doctor3 = new Doctor(1003,"Vijay","Safdarganj");
        Doctor doctor4 = new Doctor(1001," Vishal" ,"AIIMS");
        Doctor doctor5 = new Doctor(1002,"Amit","SADAR");
        Doctor doctor6 = new Doctor(1003,"Vijay","Safdarganj");
        System.out.println("HashCode of Doctor1 Hashset :" + doctor1.hashCode());
        System.out.println("HashCode of Doctor2 Hashset :" + doctor2.hashCode());
        System.out.println("HashCode of Doctor3 Hashset :" + doctor3.hashCode());
        System.out.println("HashCode of Doctor4 Hashset :" + doctor4.hashCode());
        System.out.println("HashCode of Doctor5 Hashset :" + doctor5.hashCode());
        System.out.println("HashCode of Doctor6 Hashset :" + doctor6.hashCode());

        createDoctorHashSet.add(doctor1);
        createDoctorHashSet.add(doctor2);
        createDoctorHashSet.add(doctor3);
        createDoctorHashSet.add(doctor4);
        createDoctorHashSet.add(doctor5);
        createDoctorHashSet.add(doctor6);

        return createDoctorHashSet;
    }


    public static void main(String[] args) {

        DoctorHashset obj= new DoctorHashset();
        HashSet<Doctor> createDoctorHashSet =  obj.doctorHashSet();
        for(Doctor var: createDoctorHashSet){
            System.out.println("HasSet of DoctorID : " +var.getId() +" ,Doctor Name :" +var.getDrName() + ", Hospital Name : " + var.getHospital());
        }


    }
}
