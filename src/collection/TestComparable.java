package collection;

import common.Employee;

import java.util.*;

public class TestComparable {

    public void calc() {
        Employee E1 = new Employee(111, "John");
        Employee E2 = new Employee(222, "Jacob");
        Employee E3 = new Employee(333, "Kevin");
        Employee E4 = new Employee(444, "Mathew");
        Employee E5 = new Employee(555, "Kevin D");

        TreeSet<Employee> empSet = new TreeSet<>();
        empSet.add(E1);
        empSet.add(E2);
        empSet.add(E3);
        empSet.add(E4);
        empSet.add(E5);

        Iterator<Employee> itr = empSet.iterator();
        System.out.println("Length: "+empSet.size());
        while (itr.hasNext()) {
            Employee temp=(Employee)itr.next();
            System.out.println(temp.getEmpId()+": "+temp.getName());
        }
    }

}
