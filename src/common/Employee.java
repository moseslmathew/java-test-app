package common;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable, Comparable<Object> {

    private String name;
    private int empId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return empId == employee.empId && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, empId);
    }

    @Override
    public int compareTo(Object o) {
        int empId=this.empId;
        Employee emp=(Employee) o;
        return Integer.compare(emp.empId,empId);

    }

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



}
