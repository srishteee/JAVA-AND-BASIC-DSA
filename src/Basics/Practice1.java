package Basics;

import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
//        List<Integer> list = Arrays.asList(10,9,8,5,4,3,7);
//        list.stream()  // creation of a stream
//                .filter(n->n%2==0)  // intermediate operation
//                .forEach(System.out::println);  // terminal operation it means it close the stream
//    }
//}
//2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?  -- remaining

//  How to find duplicate elements in a given integers list in java using Stream functions?

        List<Integer> mylist = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> set = new HashSet<>();
        mylist.stream().filter(n-> !set.add(n)).distinct().forEach(System.out::println);

    }}