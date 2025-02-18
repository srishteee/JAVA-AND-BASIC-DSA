package Basics;

import java.util.Scanner;

public class Prac2 {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner (System.in);
//        int n= scn.nextInt();
//        int a=0;
//        int b=1;
//        for(int i=0;i<n;i++){
//            System.out.println(a);
//            int c= a+b;
//            a=b;
//            b=c;
//
//        }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String result = reverse(str);
        System.out.println(result);

    }
    public static String reverse(String str){
        StringBuilder strBuild=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--) {
            strBuild.append(str.charAt(i));

        }
        return strBuild.toString();
    }


    }

