package Arrays;

import java.util.Scanner;

// Input: arr[] = {1, 4, 3, 2, 6, 5}
//Output: {5, 6, 2, 3, 4, 1}
public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter " + n + " elements:");

        for(int i=0;i<arr.length;i++){
          arr[i]= scn.nextInt();
            }
        int start = 0;
        int end = n-1;

        while(start<end){
            int temp = arr[start];
            arr [start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        }
    }


