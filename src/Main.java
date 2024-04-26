public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        InitGame initialize = new InitGame(library.words);
        PlayGame game = new PlayGame(initialize.getWordToFind(), initialize.getnumberOfTries());
        System.out.println("The word to find is: " + initialize.getWordToFind());
        game.startGame();
    }
}