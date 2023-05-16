package collection;

import util.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

    public void collect(){
        Employee E1=new Employee();
        Employee E2=new Employee();
        Employee E3=new Employee();
        Employee E4=new Employee();

        E1.setName("John");
        E1.setEmpID(111);
        E2.setName("Jacob");
        E2.setEmpID(222);
        E3.setName("Kevin");
        E3.setEmpID(333);
        E4.setName("Mathew");
        E4.setEmpID(444);

        ArrayList<Employee> employeeList= new ArrayList<>();
        employeeList.add(E1);
        employeeList.add(E2);
        employeeList.add(E3);
        employeeList.add(E4);
        Iterator itr= employeeList.iterator();
        while (itr.hasNext())
        {
            Employee emp = (Employee) itr.next();
        }
    }
}
