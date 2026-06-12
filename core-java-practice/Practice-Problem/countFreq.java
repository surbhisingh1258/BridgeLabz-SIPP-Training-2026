import java.util.Scanner;

public class CountFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ' && ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        System.out.println("Character Frequencies:");

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " -> " + freq[i]);
            }
        }

        sc.close();
    }
}