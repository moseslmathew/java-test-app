import basics.TestGenerics;

public class Main {
    public static void main(String[] args){
        TestGenerics<Integer, String> obj=new TestGenerics<>();
        obj.setEmployeeID(123);
        obj.setName("Test");
        obj.display();
    }


}