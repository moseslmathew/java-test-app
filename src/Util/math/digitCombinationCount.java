package Util.math;
import java.util.ArrayList;

//get the count of numbers which contain a digit. Computed between two limits
//Example: Get count of numbers between 99 and 1000 such that it contains digit 7
public class digitCombinationCount {

    public void calc() {

        int numberToCheck=7;
        int startNumber = 100;
        int endNumber = 999;
        int numberOfDuplicates=2;
        ArrayList<Integer> numberList=new ArrayList<>();

        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = 1; j <= (int) (Math.log10(i) + 1); j++) {
                if (getPositionalDigit(i, j) == numberToCheck) {
                    numberList.add(i);
                    break;
                }
            }
        }
        System.out.println(numberList);
        System.out.println("Total count: " + numberList.size());
        numberList.clear();

        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = 1; j <= (int) (Math.log10(i) + 1); j++) {
                if (getPositionalDigit(i, j) == numberToCheck) {
                    if (numberOfRepetition(i,numberToCheck) == numberOfDuplicates) {
                        numberList.add(i);
                        break;
                    }
                }
            }
        }
        System.out.println("Total non duplicate number count: " + numberList);
        System.out.println("Total non duplicate number count: " + numberList.size());
    }


    public int getPositionalDigit(int number, int position) {
        int length = (int) (Math.log10(number) + 1);
        position = length - position;
        int tens = (int) Math.pow(10, position);
        int num1 = number > 0 ? number / tens : number;
        return (num1 % 10);
    }

    public int numberOfRepetition(int number, int referenceDigit) {
        int temp=0;
        int length = (int) (Math.log10(number) + 1);
        for(int i=1;i<=length;i++)
        {
            if(getPositionalDigit(number,i)==referenceDigit)
            {
                temp++;
            }
        }

        return temp;
    }

}
