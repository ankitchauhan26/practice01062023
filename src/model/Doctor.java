package model;

public class Doctor {

    int id;
    String drName;
    String hospital;

    public Doctor(int id, String drName, String hospital) {
        this.id = id;
        this.drName = drName;
        this.hospital = hospital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
