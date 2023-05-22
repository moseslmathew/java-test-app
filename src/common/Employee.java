package common;

import java.io.Serializable;

public class Employee implements Serializable, Comparable<Object> {

    private String name;
    private int empId;

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public Employee(int empID, String name) {
        this.empId=empID;
        this.name=name;
    }


    @Override
    public int compareTo(Object o) {
        int empId=this.empId;
        Employee emp=(Employee) o;
        return Integer.compare(emp.empId,empId);

    }
}
