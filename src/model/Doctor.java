package model;

import java.util.Objects;

public class Doctor {

    int id;
    String drName;
    String hospital;

    public Doctor(int id, String drName, String hospital) {
        this.id = id;
        this.drName = drName;
        this.hospital = hospital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor doctor)) return false;
        return getId() == doctor.getId() && Objects.equals(getDrName(), doctor.getDrName()) && Objects.equals(getHospital(), doctor.getHospital());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDrName(), getHospital());
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
