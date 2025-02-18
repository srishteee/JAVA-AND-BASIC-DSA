package Basics;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String result = reverseMethod(str);
        System.out.println(result);


    }
    public static String reverseMethod(String str){
        StringBuilder strBuild = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            strBuild.append(str.charAt(i));
        }
        return strBuild.toString();
    }

}
