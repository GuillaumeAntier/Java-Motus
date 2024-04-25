import java.util.Scanner;

public class InitGame {

    private Integer numberOfTries;
    private String numberOfLetters;
    private String wordToFind;

    public InitGame() {
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
        return "test";
    }

    public Integer getnumberOfTries() {
        return this.numberOfTries;
    }

    public String getWordToFind() {
        return this.wordToFind;
    }

}
