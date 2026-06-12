import java.util.Scanner;

public class SpyAgency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter secret message: ");
        String message = sc.nextLine();

        
        String reversed = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reversed += message.charAt(i);
        }

        System.out.println("Reversed Message: " + reversed);

        if (message.equalsIgnoreCase(reversed)) {
            System.out.println("Message is a Palindrome");
        } else {
            System.out.println("Message is NOT a Palindrome");
        }

        int vowels = 0;
        int consonants = 0;

        String lower = message.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        
        System.out.print("\nEnter first intercept: ");
        String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter second intercept: ");
        String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        boolean anagram = true;

        if (str1.length() != str2.length()) {
            anagram = false;
        } else {
            int[] freq = new int[26];

            for (int i = 0; i < str1.length(); i++) {
                freq[str1.charAt(i) - 'a']++;
                freq[str2.charAt(i) - 'a']--;
            }

            for (int count : freq) {
                if (count != 0) {
                    anagram = false;
                    break;
                }
            }
        }

        if (anagram) {
            System.out.println("Intercepts are Anagrams");
        } else {
            System.out.println("Intercepts are NOT Anagrams");
        }

        System.out.print("\nEnter surveillance log: ");
        String log = sc.nextLine();

        int[] count = new int[256];

        for (int i = 0; i < log.length(); i++) {
            count[log.charAt(i)]++;
        }

        char firstNonRepeating = '\0';

        for (int i = 0; i < log.length(); i++) {
            if (count[log.charAt(i)] == 1) {
                firstNonRepeating = log.charAt(i);
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println("First Non-Repeating Character: "
                    + firstNonRepeating);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        sc.close();
    }
}