package basics;

public class nestedClassTest {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void mainClassMethod() {
        System.out.println("In Main Class");
    }

    //static subclass
    public static class staticSubclass {
        public void staticSubclassMethod() {
            System.out.println("In static subclass");
        }
    }


    public class subclass {
        public void subclassMethod() {
            System.out.println("In subclass");

        }
    }


}
