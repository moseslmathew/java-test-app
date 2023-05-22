package collection;

import common.*;

import java.io.Serializable;
import java.util.ArrayList;

public class TestArrayListPlus {

    public void collect(){

        Employee E1=new Employee(111,"John");
        Employee E2=new Employee(222,"Jacob");
        Employee E3=new Employee(333,"Kevin");
        Employee E4=new Employee(444,"Mathew");

        Manager M1=new Manager(011,"Kim",5,"star Hub");
        Manager M2=new Manager(022,"Jim",5,"AD");


        //Heterogeneous ArrayList
        ArrayList<Object> empManager=new ArrayList<>();
        empManager.add(E1);
        empManager.add(E2);
        empManager.add(M1);
        empManager.add(M2);
        System.out.println(empManager);
        System.out.println(((Employee) empManager.get(1)).getName());
        System.out.println(empManager instanceof Serializable);



        ArrayList<Employee> employeeList= new ArrayList<>();
        employeeList.add(E1);
        employeeList.add(E2);
        employeeList.add(E3);
        employeeList.add(E4);


    }




}
