/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{

    private String clue = "DEFAULT";
    private String name = "DEFAULT";
    
    /**
     * Creates a Celebrity instance with the supplied answer and clue
     * @param answer
     * @param clue
     */
    public Celebrity(String answer, String hint)
    {
        name = answer;
        clue = hint;
    }
    public Celebrity()
    {
    }

    /**
     * Supplies the clue for the celebrity
     * @return
     */
    public String getClue()
    {
        return clue;
    }

    /**
     * Supplies the answer for the celebrity.
     * @return
     */
    public String getAnswer()
    {
        return name;
    }

    /**
     * Updates the clue to the provided String.
     * @param clue The new clue.
     */
    public void setClue(String hint)
    {
        clue = hint;
    }

    /**
     * Updates the answer to the provided String.
     * @param answer The new answer.
     */
    public void setAnswer(String answer)
    {
        name = answer;
    }
    
    /**
     * Provides a String representation of the Celebrity.
     */
    @Override
    public String toString()
    {
        String out = "";
        out = name.replaceAll("\\s","");
        out = out.toLowerCase();
        return out;
    }
    
}
