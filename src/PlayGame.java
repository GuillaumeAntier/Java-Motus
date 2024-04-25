import java.util.Scanner;

public class PlayGame {
    private String wordToFind;
    private Integer numberOfTries;

    public PlayGame(String wordToFind, Integer numberOfTries) {
        this.wordToFind = wordToFind;
        this.numberOfTries = numberOfTries;
    }

    public void startGame(){
        boolean findWord = false;
        while (numberOfTries != 0 && !findWord ) {
            String word = askUser();
            if (word.equals(wordToFind)){
                displayGame(word);
                System.out.println("Congratulations, you found the word!");
                findWord = true;
            } else {
                numberOfTries--;
                displayGame(word);
            }
        }
        if (numberOfTries == 0){
            System.out.println("You lost, the word to find was: " + wordToFind);
        }
    }

    public void displayGame(String word){
        System.out.println("You put the following word: " + word);
        System.out.println(" ");
        System.out.println("---------------------------");
        for (int i = 0; i < wordToFind.length(); i++){
            if (word.charAt(i) == wordToFind.charAt(i)){
                System.out.print(" | " +"\033[42;30m" + " " + word.charAt(i) + " " + "\033[0m" + " ");
            } else if ( wordToFind.contains(String.valueOf(word.charAt(i)))){
                System.out.print(" | " +"\033[43;30m" + " " + word.charAt(i) + " " + "\033[0m" + " ");
            }
            else {
                System.out.print(" | " +"\033[41;30m" + " " + word.charAt(i) + " " + "\033[0m" + " ");
            }
        }
        System.out.println(" | ");
        System.out.println("---------------------------");
        System.out.println(" ");
        System.out.println("You have " + numberOfTries + " tries left");
    }

    public String askUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scanner.nextLine();
        if (word.length() != wordToFind.length() && !word.matches("[a-zA-Z]")){
            System.out.println("Please enter a valid word");
            return askUser();
        }
        return word;
    }
}

