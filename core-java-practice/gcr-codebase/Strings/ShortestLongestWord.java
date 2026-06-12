import java.util.Scanner;

public class ShortestLongestWord {
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    
    public static String[] splitText(String text) {

        int length = findLength(text);

        int wordCount = 1;

        
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {

                String word = "";

                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }

                words[wordIndex++] = word;
                start = i + 1;
            }
        }

        
        String lastWord = "";

        for (int i = start; i < length; i++) {
            lastWord += text.charAt(i);
        }

        words[wordIndex] = lastWord;

        return words;
    }

    
    public static String[][] getWordLengthArray(String[] words) {

        String[][] wordLength = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLength[i][0] = words[i];
            wordLength[i][1] = String.valueOf(findLength(words[i]));
        }

        return wordLength;
    }

    
    public static int[] findShortestAndLongest(String[][] wordLength) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < wordLength.length; i++) {

            int currentLength = Integer.parseInt(wordLength[i][1]);

            if (currentLength < Integer.parseInt(wordLength[shortest][1])) {
                shortest = i;
            }

            if (currentLength > Integer.parseInt(wordLength[longest][1])) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);

        String[][] wordLengthArray = getWordLengthArray(words);

        int[] result = findShortestAndLongest(wordLengthArray);

        int shortestIndex = result[0];
        int longestIndex = result[1];

        System.out.println("\nWord and Length Table:");
        System.out.println("Word\t\tLength");

        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "\t\t" +
                               wordLengthArray[i][1]);
        }

        System.out.println("\nShortest Word: "
                + wordLengthArray[shortestIndex][0]
                + " (Length = "
                + wordLengthArray[shortestIndex][1] + ")");

        System.out.println("Longest Word: "
                + wordLengthArray[longestIndex][0]
                + " (Length = "
                + wordLengthArray[longestIndex][1] + ")");

        sc.close();
    }
}