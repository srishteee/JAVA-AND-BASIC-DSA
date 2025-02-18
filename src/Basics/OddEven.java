package Basics;

import java.util.Scanner;
// 5 ! ==
public class OddEven {

    public static boolean IsPrime(int n) {

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }


    public static void main(String[] args) {
//

int number =31;
if(IsPrime(number)){
    System.out.println(number + "no is prime"  );
} else{
    System.out.println(number + "no is not prime");
}
//       Scanner scn = new Scanner(System.in);
//       int n= scn.nextInt();
//       int start = 1;
//       for(int i=1;i<=n;i++){
//         start=start*i;
//
//=-0
//       }
//        System.out.println(start);


    }
}
