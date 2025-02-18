package Strings;

import java.util.Scanner;

public class CountStringNo {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scn.nextLine();

        System.out.println("Enter a substring:");
        String ss = scn.nextLine();

        // Call the countSubstring method and store the result
        int count = countSubstring(str, ss);

        // Print the count
        System.out.println("'" + ss + "' - " + count);
    }

    public static int countSubstring(String str, String ss) {
        int count = 0;
        int strLen = str.length();
        int subLen = ss.length();
 // askas - 5-2 =3 , j-a
        for (int i = 0; i <= strLen - subLen; i++) {
            boolean match = true;
            for (int j = 0; j < subLen; j++) {  // a+a = a
                if (str.charAt(i + j) != ss.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }

        return count;
    }
    }


