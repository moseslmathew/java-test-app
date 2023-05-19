package common;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int empID;

    public String getName() {
        return name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }


}
