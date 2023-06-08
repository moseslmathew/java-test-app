package basics;

public class NestedClassTest {
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
        NestedClassTest obj=new NestedClassTest();
        obj.mainClassMethod();

        NestedClassTest.subclass obj2= obj.new subclass();
        obj2.subclassMethod();

        NestedClassTest.staticSubclass obj3= new NestedClassTest.staticSubclass();
        obj3.staticSubclassMethod();
    }
}
