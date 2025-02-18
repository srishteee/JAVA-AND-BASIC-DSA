package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPracc {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        // add(int index, Element e)
        list1.add(0,100);
        list1.add(1,200);
        list1.add(2,300);

        System.out.println(list1);

        // addAll(int index, Collection c)
        List<Integer> list2 = new ArrayList<>();
        list1.add(0,400);
        list1.add(1,500);
        list1.add(2,600);

        list1.addAll(2, list2);
        list1.forEach((Integer val)-> System.out.println());

        // get (int index)
        System.out.println("value prsent at 2 is :" +  list1.get(2));

        // set (int index, Elelement e)

        list1.set(2,-400);
        System.out.println("after set method");
        list1.forEach((Integer val)-> System.out.println(val));

        // replaceAll(Unaryoperator op) -> unary operator is a functional interface
        list1.replaceAll((Integer val)-> -1*val);
        System.out.println("after replace all");
        list1.forEach((Integer val)-> System.out.println(val));

        // sort (using comparatot)

        list1.sort((Integer val1,Integer val2)->val1-val2);
        System.out.println("decreaasing order");
        list1.forEach((Integer val)-> System.out.println(val));

    }
}
