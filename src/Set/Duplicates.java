package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Finding duplicates
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!seen.add(arr[i])) {
                duplicate.add(arr[i]);
            }
        }

        // Output
        if (duplicate.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements: " + duplicate);
        }

        scn.close(); //Close the scanner
    }
}


// we use this approach because :
//Fast Duplicate Detection — HashSet
//The method seen.add(arr[i]):
//
//Returns true if the element is added for the first time.
//
//        Returns false if the element already exists in the set → meaning it's a duplicate.
//
//Time Complexity: O(1) on average per element (total O(n) for the array).
//
//Using a set avoids nested loops, which would be O(n²).
//
//        . Store only Duplicates — LinkedHashSet
//We use a second set (duplicate) to:
//
//Store only duplicates (the ones we’ve seen before).
//
//Maintain insertion order with LinkedHashSet, so the duplicates appear in the order they repeat.
//
//Prevents repeated duplicates from appearing again in output.
