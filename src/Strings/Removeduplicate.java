package Strings;
import java.util.Scanner;
public class Removeduplicate {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string:");
            String input = scanner.nextLine();
            String result = removeDuplicates(input);
            System.out.println("Result: " + result);
        }

        public static String removeDuplicates(String str) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                // Check manually if the character already exists in the result
                boolean isDuplicate = false;
                for (int j = 0; j < result.length(); j++) {
                    if (result.charAt(j) == ch) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {

                     result += ch;


                }
            }
            return result;
        }
    }


