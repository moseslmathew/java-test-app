package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

       public void collect(){
           ArrayList<Integer> ageList=new ArrayList<>();
           ageList.add(12);
           ageList.add(15);
           ageList.add(5);
           ageList.add(10);
           ageList.add(50);
           ageList.add(60);
           ageList.add(88);
           Integer temp=0;

           System.out.println("initial List:"+ageList);

           Iterator itr= ageList.iterator();
           while(itr.hasNext()){
               temp=(Integer) itr.next();
               if (temp>20)
                   itr.remove();
           }
           System.out.println("Updated List:"+ageList);


    }
}
