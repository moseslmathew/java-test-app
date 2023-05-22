package Util.math;

import java.util.*;

public class wordCombination {
    private String givenWord = "Testt";

    public String getGivenWord() {
        return givenWord;
    }

    public void calc() {
        char[] givenWordArray = givenWord.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char ch : givenWordArray) {
            map.put(ch,getRepeatCount(givenWord,ch));
        }
        System.out.println(givenWordArray.length);
        System.out.println(map);
        System.out.println(calculus.getFactorial(4));
        int temp=0;
        for(int i=0;i<map.size();i++){
            temp=calculus.getFactorial(givenWordArray)/calculus.getFactorial()
        }


    }

    public int getRepeatCount(String str, char c) {
        int count = 0;
        char[] charArray = str.toLowerCase().toCharArray();
        for (char ch : charArray) {
            if (ch == c)
                count++;
        }
        return count;
    }

}
