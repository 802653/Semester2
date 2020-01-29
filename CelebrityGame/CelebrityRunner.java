/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
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
        celeb.add(new Celebrity("Justin Trudeau", "First African-Canadian PM of Canada"));
        System.out.println(celeb);
        CelebrityGame game = new CelebrityGame(celeb);
    }

}
