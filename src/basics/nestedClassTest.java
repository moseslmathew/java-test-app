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
    public class medicalHistory{

    }
    public void mainClassMethod(){
        System.out.println("In Main Class");
    }

    public static class subclass {
        public void subclassMethod(){
            System.out.println("In subclass");
        }
    }


}
