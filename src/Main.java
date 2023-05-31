import Util.math.wordCombination;
import basics.TestRecursion;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> combinationList=new ArrayList<>();
        wordCombination.printWordCombinations("1234","",combinationList);
        System.out.println("Result:"+combinationList);
    }


}