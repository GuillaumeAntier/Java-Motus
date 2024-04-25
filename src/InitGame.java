import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InitGame {

    private Integer numberOfTries;
    private String numberOfLetters;
    private String wordToFind;
    private List<String> library;

    public InitGame(List<String> words) {
        if (words == null) {
            throw new IllegalArgumentException("Words list cannot be null");
        }
        this.library = words;
        this.numberOfLetters = askNumberOfLetters();
        this.wordToFind = generateWord(this.numberOfLetters);
        this.numberOfTries = askNumberOfTries();

    }

    private String askNumberOfLetters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many letters should the word contain?");
        return scanner.nextLine();
    }

    private Integer askNumberOfTries() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tries do you want?");
        return scanner.nextInt();
    }

    private String generateWord(String numberOfLetters) {

        String word = "";

        do {
            word = library.get((int) (Math.random() * library.size()));
        } while (word.length() != Integer.parseInt(numberOfLetters)); {}
        return word;
    }

    public Integer getnumberOfTries() {
        return this.numberOfTries;
    }

    public String getWordToFind() {
        return this.wordToFind;
    }

}
