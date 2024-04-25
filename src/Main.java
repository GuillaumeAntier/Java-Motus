public class Main {
    public static void main(String[] args) {
        InitGame initialize = new InitGame();
        PlayGame game = new PlayGame(initialize.getWordToFind(), initialize.getnumberOfTries());
    }
}