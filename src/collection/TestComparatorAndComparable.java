package collection;

import java.util.*;

public class TestComparatorAndComparable {
    private final String givenWord = "Testt";

    public void calc() {
        ArrayList<String> givenWordList = new ArrayList<>(Arrays.asList(givenWord.toLowerCase().split("")));
        HashSet<String> givenWordSet = new LinkedHashSet<>(givenWordList);
        TreeSet<String> givenWordSortedSet = new TreeSet<>(givenWordList);
        System.out.println("Word List: " + givenWordList);
        System.out.println("Word Set: " + givenWordSet);
        System.out.println("Word Sorted set: " + givenWordSortedSet);

        //Custom sorting order by implementing compare method in myComparator class
        TreeSet<String> givenWordSortedSet2 = new TreeSet<>(new myComparator());
        givenWordSortedSet2.addAll(givenWordList);
        System.out.println("Word with custom Sorted set: " + givenWordSortedSet2);
    }

    public static class myComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(o2.hashCode(), o1.hashCode());
        }
    }

}
