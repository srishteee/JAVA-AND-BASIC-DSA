package Arrays;

import java.util.Scanner;
// find the avg of an array
public class Maximumm {

    public static void main(String[] args) {


        int[] arr = {10, 11, 12, 13, 14, 15}; // creation of array

        int elements = 0;
        for(int i=0;i<arr.length;i++){
           elements= elements+arr[i];
        }
        int avg = elements/ arr.length;
        System.out.println(avg);
    }
}

// find avg of an array = elements/no of elements
// for sorted array approach-> i[0]= min , i[n-1]= max -> print
// approach
// first- traverse-> if min = arr.i[0] , put in the minimum.



