package basics;

import common.Employee;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serilizableTest {

    public void test() throws IOException {
        Employee emp= new Employee(111,"George");

        Employee emp1= new Employee(222,"mat");

        String data = "This is a line of text inside the file.";
        FileOutputStream flStream= new FileOutputStream("C:\\Users\\moses\\OneDrive\\Desktop\\Personal\\TestFileStream.txt");
        byte[] array = data.getBytes();
        flStream.write(array);


//        ObjectOutputStream objStream=new ObjectOutputStream(flStream);
//        objStream.writeObject(emp);
//        objStream.writeObject(emp1);
//        objStream.close();

        flStream.close();




    }

}
