package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrac {
    public static void main(String[] args) {

        Map<Integer,String> hm = new HashMap<>();
        hm.put(null,"test");
        hm.put(1,"A");
        hm.put(2,"B");

        // compute if present
        hm.putIfAbsent(null,"test");
        hm.putIfAbsent(0,"Zero");
        hm.putIfAbsent(3,"C");

        for(Map.Entry<Integer, String> entryMap : hm.entrySet()){

            Integer key = entryMap.getKey();
            String value =entryMap.getValue();

            System.out.println("key:" +key    +   "values:" +value);

        }

        System.out.println("isEmpty()  " + hm.isEmpty());

        System.out.println("size" +  hm.size());

        System.out.println("containsKey(1)"   +hm.containsKey(3));

        System.out.println("get" + hm.get(1));

        // keySet() --> provide all keys
        for(Integer key:hm.keySet()){
            System.out.println("key:" + key);
        }

        // valueSet()-> provide al;l value

        for(String value: hm.values()){
            System.out.println("values :"+value);
        }
    }
}
