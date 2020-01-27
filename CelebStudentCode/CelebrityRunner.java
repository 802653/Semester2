/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
<<<<<<< HEAD
public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{

	}
=======
import java.util.*;
public class CelebrityRunner
{
    /**
     * The entry point of the Java application.
       * @param args Unused parameter as it is a GUI based program.
     */
    private static ArrayList<Celebrity> celeb = new ArrayList<Celebrity>();
    public static void main(String [] args)
    {
        
        celeb.add(new Celebrity("Lebron James", "Star Lakers Player"));
        celeb.add(new Celebrity("Patrick Mahomes", "Star Cheifs Quaterback"));
        celeb.add(new Celebrity("Justin Trudeau", "First African-American PM of Canada"));
        System.out.println(celeb);
        CelebrityGame game = new CelebrityGame(celeb);
        game.prepareGame();
        game.play();
    }
>>>>>>> 6fd1d72b67c3cf7d78746b0bf6d9863a9a302d6a
}
