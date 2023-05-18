package collection;

import common.Employee;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestIterator {

    public void collect(){
        Employee E1=new Employee();
        Employee E2=new Employee();
        Employee E3=new Employee();
        Employee E4=new Employee();
        Employee E5=new Employee();

        E1.setName("John");
        E1.setEmpID(111);
        E2.setName("Jacob");
        E2.setEmpID(222);
        E3.setName("Kevin");
        E3.setEmpID(333);
        E4.setName("Mathew");
        E4.setEmpID(444);
        E5.setName("Kevin D");
        E5.setEmpID(555);

        ArrayList<Employee> employeeList= new ArrayList<>();
        employeeList.add(E1);
        employeeList.add(E2);
        employeeList.add(E3);
        employeeList.add(E4);

        for(ListIterator<Employee> it=employeeList.listIterator(); it.hasNext();) {
            System.out.println(it.getClass().getName());
            if(it.next().getName()=="Kevin") {
                it.set(E5);
                it.add(E1);
            }

        }

        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }

    }
}
