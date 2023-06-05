import basics.nestedClassTest;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        nestedClassTest obj=new nestedClassTest();
        obj.mainClassMethod();

        nestedClassTest.subclass obj2= obj.new subclass();
        obj2.subclassMethod();

        nestedClassTest.staticSubclass obj3= new nestedClassTest.staticSubclass();
        obj3.staticSubclassMethod();

    }


}