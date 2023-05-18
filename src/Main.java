import basics.nestedClassTest;

public class Main {
    public static void main(String[] args) {
        nestedClassTest obj=new nestedClassTest();
        System.out.println(obj.getClass().getName());

        nestedClassTest.subclass objsub= new nestedClassTest.subclass();
        System.out.println(objsub.getClass().getName());
    }


}