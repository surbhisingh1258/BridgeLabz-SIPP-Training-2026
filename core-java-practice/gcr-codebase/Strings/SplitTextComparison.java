import java.util.Scanner;

public class SplitTextComparison {

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

        
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        
        String[] words = new String[wordCount];

        int start = 0;

        for (int i = 0; i < wordCount - 1; i++) {
            String word = "";

            for (int j = start; j < spaceIndexes[i]; j++) {
                word += text.charAt(j);
            }

            words[i] = word;
            start = spaceIndexes[i] + 1;
        }

        
        String lastWord = "";
        for (int j = start; j < length; j++) {
            lastWord += text.charAt(j);
        }

        words[wordCount - 1] = lastWord;

        return words;
    }


    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        
        String[] userWords = splitText(text);

    
        String[] builtInWords = text.split(" ");


        boolean result = compareArrays(userWords, builtInWords);

        System.out.println("\nWords using user-defined method:");
        for (String word : userWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using split() method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both arrays equal? " + result);

        sc.close();
    }
}