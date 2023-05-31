import Util.math.wordCombination;
import basics.TestRecursion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<String> combinationList=new HashSet<>();
        wordCombination.printWordCombinations("IIJS","",combinationList);
        System.out.println("Result:"+combinationList);
    }


}