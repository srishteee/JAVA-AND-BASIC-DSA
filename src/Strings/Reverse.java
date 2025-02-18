package Strings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        char [] charArr = str.toCharArray();
     reverseString(charArr);
        System.out.println(charArr);

    }
    public static void reverseString(char [] str){

        int left =0;
        int right =str.length-1;

        for (int i=0;i< str.length;i++){
            while(left<right){
                char temp = str[left];
                str[left]=str[right];
                str[right]= temp;
                left++;
                right--;
            }
        }

    }
}
