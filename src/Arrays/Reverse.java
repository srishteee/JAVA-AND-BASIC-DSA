package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reverse  {

    public static void display(int [] a) {
        StringBuilder sb = new StringBuilder();

        for(int val: a)  {
            sb.append(val +   "   ") ;
        }
        System.out.println(sb);
    }


    public static void reverse(int[] a){
//   logic
        int i=0;
        int j = a.length-1;
        if(i<j) {
            int temp = a[i];
            a[i]= a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        reverse(a);
        display(a);
    }
}

