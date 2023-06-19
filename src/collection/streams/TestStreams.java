package collection.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestStreams {

    public void disp(){
        Integer[] temp={1,4,5,7,8,9,2,4,5,6};
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(temp));
        System.out.println(numbers.stream().map(item-> mul(item,3)).collect(Collectors.toList()));
        System.out.println(numbers.stream().map(item->item*5).collect(Collectors.toList()));
        System.out.println(numbers.stream().filter(item->item%2==0).collect(Collectors.toList()));
        System.out.println(numbers.stream().filter(item->item%2==0).count());

        //Sorting
        System.out.println("<------------Sorting------------->");
        System.out.println(numbers.stream().sorted().collect(Collectors.toList()));
        System.out.println(numbers.stream().sorted(new myComparator()).collect(Collectors.toList()));
        System.out.println(numbers.stream().sorted(testCompare).collect(Collectors.toList()));
        System.out.println(numbers.stream().sorted((o1, o2) -> Integer.compare(o2, o1)).collect(Collectors.toList()));



    }

    public int mul(int n,int x){
        return n*3;
    }

    //Functional interface
    Comparator<Integer> testCompare = (o1, o2) -> Integer.compare(o2, o1);


    public static class myComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1,o2);
        }
    }

    public static void main(String[] args){
        TestStreams obj=new TestStreams();
        obj.disp();
    }
}
