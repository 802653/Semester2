//© A+ Computer Science
// www.apluscompsci.com

//generic comparable example

public class Word implements Comparable<Word>
{
  private String orig;

  public Word(String s) { orig = s; };

  public int compareTo(Word other) 
  {
     //Comparable[] list = {orig, other};
     if(orig.length > other.length) {return 1;}
     else if(orig.length < other.length) {return -1;}
     else{return 0;}
  }

  public String toString() { return orig; }
}
