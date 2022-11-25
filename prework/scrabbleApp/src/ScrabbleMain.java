import java.util.Scanner;

public class ScrabbleMain {
    public static void main(String[] args) {
        ScrabbleScore scorer = new ScrabbleScore();
        System.out.println("Enter a word or Enter - to quit");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        while (!word.equals("-")){
            System.out.println(scorer.getScrabbleScore(word));
            System.out.println("EEnter a word or Enter - to quit ");
            word = scanner.next();
        }
    }

}
