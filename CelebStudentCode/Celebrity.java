/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
<<<<<<< HEAD
	/**
	 * The clue to determine the celebrity
	 */
	
	/**
	 * The answer or name of the celebrity.
	 */
	
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String clue)
	{
	}

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return null;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return null;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
		
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		
	}
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return null;
	}
	
=======
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

    /**
     * Supplies the clue for the celebrity
     * @return
     */
    public String getHint()
    {
        return clue;
    }

    /**
     * Supplies the answer for the celebrity.
     * @return
     */
    public String getName()
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
    
>>>>>>> 6fd1d72b67c3cf7d78746b0bf6d9863a9a302d6a
}
