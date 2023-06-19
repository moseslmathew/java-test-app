package collection;

import java.util.*;

public class TestComparator {
    private final String givenWord = "Testt";

    public void calc() {
        ArrayList<String> givenWordList = new ArrayList<>(Arrays.asList(givenWord.toLowerCase().split("")));
        HashSet<String> givenWordSet = new LinkedHashSet<>(givenWordList);
        TreeSet<String> givenWordSortedSet = new TreeSet<>(givenWordList);
        System.out.println("Word List: " + givenWordList);
        System.out.println("Word Set: " + givenWordSet);
        System.out.println("Word Sorted set: " + givenWordSortedSet);


        TreeSet<String> givenWordSortedSet2 = new TreeSet<>(myComparator);
        givenWordSortedSet2.addAll(givenWordList);
        System.out.println("Word with custom Sorted set: " + givenWordSortedSet2);
    }

    //Custom sorting order by implementing compare method in Comparator interface (functional interface)
    Comparator<String> myComparator =(o1,o2)-> Integer.compare(o2.hashCode(), o1.hashCode());

    public static void main(String[] args){
        TestComparator obj=new TestComparator();
        obj.calc();
    }

}
