package basics;

import java.io.IOException;

public class nestedClassTest {
    private int id;
    private String name;

    public void mainClassMethod() {
        System.out.println("In Main Class");
    }

    //static subclass
    public static class staticSubclass {
        public void staticSubclassMethod() {
            System.out.println("In static subclass");
        }
    }

    //nonstatic subclass
    public class subclass {
        public void subclassMethod() {
            System.out.println("In subclass");
        }
    }

    public static void main(String[] args) {
        nestedClassTest obj=new nestedClassTest();
        obj.mainClassMethod();

        nestedClassTest.subclass obj2= obj.new subclass();
        obj2.subclassMethod();

        nestedClassTest.staticSubclass obj3= new nestedClassTest.staticSubclass();
        obj3.staticSubclassMethod();
    }
}
