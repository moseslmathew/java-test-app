package Util.math;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.*;

public class wordCombination {

    public static void combinationCount(String str) {
        char[] chArray = str.toLowerCase().toCharArray();
        char[] chArrayUnique = removeDuplicate(chArray);
        int totalCharCount = calculus.getFactorial(chArray.length);

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : chArrayUnique) {
            map.put(ch, getRepeatCount(str, ch));
        }


        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            totalCharCount = totalCharCount / calculus.getFactorial(item.getValue());
        }

        System.out.println("Total number Combinations that can be formed with word \"" + str + "\" is: " + totalCharCount);
    }

    public static int getRepeatCount(String str, char c) {
        int count = 0;
        char[] charArray = str.toLowerCase().toCharArray();
        for (char ch : charArray) {
            if (ch == c)
                count++;
        }
        return count;
    }

    public static char[] removeDuplicate(char[] c) {

        int temp = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (char item : c) {
            charSet.add(item);
        }
        char[] ch2 = new char[charSet.size()];
        for (Character itr : charSet) {
            ch2[temp] = itr;
            temp++;
        }

        return ch2;
    }

    //tree structure explained in RecursiveTreeCombination.bmp
    public static void printWordCombinations(String str,String currentPermResult,ArrayList<String> resultList) {

        if(str.length()==0) {
            System.out.println("Result of the tree: " + currentPermResult);
            resultList.add(currentPermResult);
        }

        for (int i = 0; i <str.length(); i++) {
            char placedChar = str.charAt(i);
            String remainingChars = str.substring(0, i) + str.substring((i + 1));
            System.out.printf("placedChar:%c remainingChars:%s currentPermResult:%s",placedChar,remainingChars,currentPermResult+placedChar);
            System.out.println();
            printWordCombinations(remainingChars, currentPermResult+placedChar,resultList);
        }

    }

    public static String removeCharAtIndex(String str, int index) {
        StringBuilder strB = new StringBuilder(str);
        strB.deleteCharAt(index);
        return strB.toString();
    }

}
