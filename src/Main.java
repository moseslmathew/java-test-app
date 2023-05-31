import Util.math.wordCombination;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<String> combinationList=new HashSet<>();
        wordCombination.printWordCombinations("IIJS","",combinationList);
        System.out.println("Result:"+combinationList);
    }


}