package collection.Generics;

public class TestGenerics<T extends Number> {

    private T result;

    public void add(T a, T b){
        System.out.println((Integer)a+(Integer)b);
    }

    public T getResult() {
        return result;
    }

    public static void main(String[] args){
        TestGenerics<Integer> obj=new TestGenerics<>();
        obj.add(1,3);
    }
}


