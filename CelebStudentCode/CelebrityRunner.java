/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner
{
    /**
     * The entry point of the Java application.
       * @param args Unused parameter as it is a GUI based program.
     */
    public static void main(String [] args)
    {
        Celebrity Trump = new Celebrity("Trump","Featured on Second Home Alone");
        System.out.println(Trump.getName() + " " + Trump.getHint());
    }
}
