import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the string:");
//        String input = scanner.nextLine();
//
//        System.out.println("Enter the pattern to find:");
//        String pattern = scanner.nextLine();
//
//        System.out.println("Enter the number of occurrences to find:");
//        int n = scanner.nextInt();
//
//        findPatternOccurrences(input, pattern, n);
        
    }

    public static void findPatternOccurrences(String input, String pattern, int n) {
        int count = 0;
        int index = 0;

        while (count < n) {
            index = input.indexOf(pattern, index);

            if (index != -1) {
                System.out.println("Pattern found at index " + index);
                count++;
                index += pattern.length();
            } else {
                break;
            }
        }

        if (count < n) {
            System.out.println("Pattern not found " + n + " times in the string.");
        }
    }
}
