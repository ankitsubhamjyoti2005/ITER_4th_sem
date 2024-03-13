

import java.util.*;

public class Main {
    public static void  main(String[] args) {
        // Input paragraph
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();

        // Input word to find
        System.out.println("Enter word to find:");
        String word = scanner.next();

        // Find index of word in paragraph
        int index = paragraph.indexOf(word);

        // Display result
        if(index != -1) {
            System.out.println("Index of '" + word + "' in paragraph: " + index);
        } else {
            System.out.println("Word not found in paragraph.");
        }

        scanner.close();
    }
}
