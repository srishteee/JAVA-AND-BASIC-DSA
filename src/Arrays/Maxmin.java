package Arrays;

import java.util.Scanner;

public class Maxmin {

//
//        Scanner scn = new Scanner(System.in);
//       int n = scn.nextInt();
//
//       int [] arr= new int[n];
//
//       int max =arr[0];
//       int min = arr[0];
//
//       for(int i=1;i< arr.length;i++){
//           if(arr[i]>ma x){
//               max=arr[i];
//           }
//           if(arr[i]<min){
//               min=arr[i];
//           }
//       }

        public static void main(String[] args) {
            Scanner scn = new Scanner (System.in);
            int n = scn.nextInt();

            int [] arr = new int[n];
            int max = arr[0];
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
        }}









