package DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Car")
public class Car implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String model;
    private String madeBy;
    private String regNumber;

    public Car(String model, String madeBy, String regNumber) {
        this.model = model;
        this.madeBy = madeBy;
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", madeBy='" + madeBy + '\'' +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
}
