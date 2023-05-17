package collection;

import common.*;

import java.io.Serializable;
import java.util.ArrayList;

public class TestArrayListPlus {

    public void collect(){

        Employee E1=new Employee();
        Employee E2=new Employee();
        Employee E3=new Employee();
        Employee E4=new Employee();

        Manager M1=new Manager();
        Manager M2=new Manager();

        E1.setName("John");
        E1.setEmpID(111);
        E2.setName("Jacob");
        E2.setEmpID(222);
        E3.setName("Kevin");
        E3.setEmpID(333);
        E4.setName("Mathew");
        E4.setEmpID(444);


        M1.setName("Kim");
        M1.setEmpID(011);
        M1.setProjectName("star Hub");
        M1.setNumberOfReportees(5);

        M1.setName("greg");
        M1.setEmpID(022);
        M1.setProjectName("AD");
        M1.setNumberOfReportees(15);


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
