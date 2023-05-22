package collection;

import common.Employee;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;

public class TestIterator {

    public void collect(){
        Employee E1=new Employee(111,"John");
        Employee E2=new Employee(222,"Jacob");
        Employee E3=new Employee(333,"Kevin");
        Employee E4=new Employee(444,"Mathew");
        Employee E5=new Employee(555,"Kevin D");


        ArrayList<Employee> employeeList= new ArrayList<>();
        employeeList.add(E1);
        employeeList.add(E2);
        employeeList.add(E3);
        employeeList.add(E4);

        for(ListIterator<Employee> it=employeeList.listIterator(); it.hasNext();) {
            System.out.println(it.getClass().getName());
            if(Objects.equals(it.next().getName(), "Kevin")) {
                it.set(E5);
                it.add(E1);
            }

        }

        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }

    }
}
