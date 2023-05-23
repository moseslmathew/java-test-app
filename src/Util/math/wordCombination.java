package Util.math;

import java.util.*;

public class wordCombination {
    private String givenWord = "Malayalam";

    public String getGivenWord() {
        return givenWord;
    }

    public void calc() {
        char[] chArray = givenWord.toLowerCase().toCharArray();
        char[] chArrayUnique=removeDuplicate(chArray);
        int totalCharCount =calculus.getFactorial(chArray.length);

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : chArrayUnique) {
            map.put(ch,getRepeatCount(givenWord,ch));
        }


        for(Map.Entry<Character, Integer> item : map.entrySet()){
            totalCharCount=totalCharCount/calculus.getFactorial(item.getValue());
        }

        System.out.println("Total number Combinations that can be formed with word \""+ givenWord+ "\" is: "+totalCharCount);
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

    public char[] removeDuplicate(char[] c){
        char[] ch=c;

        int temp=0;
        HashSet<Character> charSet=new HashSet<>();

        for(char item:ch){
            charSet.add(item);
        }
        char[] ch2=new char[charSet.size()];
        for(Character itr:charSet)
        {
            ch2[temp]=itr.charValue();
            temp++;
        }

       return ch2;
    }

}
