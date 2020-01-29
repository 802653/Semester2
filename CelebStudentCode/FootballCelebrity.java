
/**
 * Write a description of class LiteratureCelebrity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
/**
 * 
 * @author Sage Miller
 * 22/04/2019
 */
// they also didnt provide us with the lit celeb, so had to borrow from cartoon
public class FootballCelebrity extends Celebrity {
  private String book;
  public FootballCelebrity(String answer, String clue)
  {
    super(answer, clue.substring(clue.indexOf(",")+1));
    book = clue.substring(0,clue.indexOf(","));
    setAnswer(answer);
  }
  
  @Override
  public String getClue() 
  {
    if(Math.random()<0.5)
      return "Played as " + book;
    return super.getClue();
  }
  @Override
  public String toString() 
  {
    return super.toString() + ", and the character played as " + book;
  }
  
  public void setClue(String clue) 
  {
    setClue(clue);
  }
}

/*public class LiteratureCelebrity extends Celebrity
{
    private ArrayList<String> clue = new ArrayList<String>();
    private String name = "DEFAULT";
    
    public LiteratureCelebrity(String answer, ArrayList<String> hint)
    {
        super();
        name = answer;
        clue = hint;
    }
    
    
    public String getClue()
    {
        return clue.get((int)(Math.random() * clue.size()));
    }
    public String getAnswer()
    {
        return name;
    }
    public String toString()
    {
        String out = "";
        out = name.replaceAll("\\s","");
        out = out.toLowerCase();
        return out;
    } 
}
*/

