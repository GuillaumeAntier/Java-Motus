import java.util.Scanner;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


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
        Object dictionnary = new JSONParser().parse(new FileReader("words.json"));
    }

    public Integer getnumberOfTries() {
        return this.numberOfTries;
    }

    public String getWordToFind() {
        return this.wordToFind;
    }

}
