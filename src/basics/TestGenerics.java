package basics;

public class TestGenerics<T,V> {
    private T employeeID;
    private V name;


    public void setEmployeeID(T employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(V name) {
        this.name = name;
    }

    public void display() {
        System.out.println("EmpID is:" + this.employeeID);
        System.out.println("Name is:" + this.name);
    }

    public static void main(String[] args){
        TestGenerics<Integer, String> obj=new TestGenerics<>();
        obj.setEmployeeID(123);
        obj.setName("Test");
        obj.display();
    }

}
