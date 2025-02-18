package Strings;

import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        char[] charArr = s.toCharArray();

        reverseString(charArr);
        System.out.println(charArr);


    }
    public static  void reverseString(char s []){
// two pointer approach
        int left=0;
        int right=s.length-1;

       while(left<right){
           char temp = s[left];
       s[left]= s[right];
       s[right]=temp;
       left++;
       right--;
       }

    }
}
