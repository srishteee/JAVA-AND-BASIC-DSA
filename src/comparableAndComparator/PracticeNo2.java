package comparableAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PracticeNo2 {
    public static void main(String[] args) {
        Integer[] arr = {17, 8, 9, 10, 1};

        //Arrays.sort(arr);  // interanlly .sort uses compareTo method which is comparable means val>0

        Arrays.sort(arr);   // val >0 -ve not allow
        // using comparator
        // int compare(T obj1,T obj2)

        //6-7 =-1 <0

//        Comparator



        Arrays.sort(arr,(Integer val1, Integer val2)->val2-val1); // for descending i made val2 - val1

        for(int v: arr){
            System.out.println(v);
        }
    }

    // ccollections.sort -> internally it will first convert to array and then array.sort



}
