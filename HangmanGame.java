
/**
 * Generates the word for hangman, the guessed letters, and the game status
 *
 * @author Suzy and Vedha
 * @version 2019-11-16
 */
public class HangmanGame
{
    private String secretWord;
    private String gameStatus = "";
    private String guessedLetters = "";
    /**
     * Constructor for objects of class HangmanGame
     */
    public HangmanGame(String secretWord)
    {
        this.secretWord = secretWord;
        this.gameStatus = gameStatus;
        this.guessedLetters = guessedLetters;
        for(int i = 0; i <= secretWord.length() - 1; i++)
        {
            if(Character.isLetter(secretWord.charAt(i)))
            {
                gameStatus += "-";
            }
            else
            {
                gameStatus += secretWord.charAt(i);
            }
        }
    }
    public String getTried()
    {
        return guessedLetters;
    }
    public String getGuessed()
    {
        return gameStatus;
    }
    public int tryLetter(char s)
    {
        for(int i = 0; i < secretWord.length(); i++)
        {
            if(secretWord.charAt(i) == s)
            {
                gameStatus = gameStatus.substring(0, i) + s + gameStatus.substring(i + 1);
            }
        }
        if(guessedLetters.indexOf(s) >= 0)
        {
            return 0;
        }
        guessedLetters += s + " ";
        if(secretWord.indexOf(s) >= 0)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
