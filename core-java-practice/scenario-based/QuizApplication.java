import java.util.Scanner;

public class QuizApplication {

    static class InvalidAnswerIndexException extends Exception {

        public InvalidAnswerIndexException(int index) {
            super("Invalid Answer Index: " + index);
        }
    }

    public static void answerCheck(String[] answer, int index)
            throws InvalidAnswerIndexException {

        if (index < 0 || index >= answer.length) {
            throw new InvalidAnswerIndexException(index);
        }

        if (answer[index].equals("A")) {
            System.out.println("Answer is A");
        } else {
            System.out.println("Answer is not A");
        }
    }

    public static void main(String[] args) {

        String[] answer = {"A", "B", "C", "D"};

        for (int i = 0; i <= answer.length; i++) { 
            try {
                answerCheck(answer, i);
            } catch (InvalidAnswerIndexException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}