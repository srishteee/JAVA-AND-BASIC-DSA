package Arrays;


import java.util.Scanner;

// 2345 -- 2 min , 5 max
public class MaxnMin {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[]=  new int[n];

        // input the first element and then intilaizing min and max
        arr[0]= scn.nextInt();
        int max =arr[0];
        int min = arr[0];
        for (int i =1;i<arr.length;i++){
            arr[i]= scn.nextInt();

            if(arr[i]>max){
               max=arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }

        }

        System.out.println("max" +max );
        System.out.println("min"+min);

    }
}
