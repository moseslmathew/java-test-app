package basics.interfaceSamples;

import java.util.ArrayList;

public class Square<T extends Number,V> implements Shapes<T,V> {


    @Override
    public void Area(T t1, T t2) {
        System.out.println((Integer) t1* (Integer) t2);
    }

    @Override
    public void show(V v1) {

    }


    public static void main(String[] args){
        Shapes<Integer,String> obj=new Square<>();
        obj.Area(3,3);
    }
}
