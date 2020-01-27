//© A+ Computer Science
// www.apluscompsci.com

//generic comparable example

public class Word implements Comparable<Word>
{
  private String orig;
  private int length;
  public Word(String s) { orig = s;};

  public int compareTo(Word other) 
  {
<<<<<<< HEAD

     //must add code to complete 

     return 1; 
=======
     //Comparable[] list = {orig, other};
     if(orig.toString().length() > other.toString().length()) {return 1;}
     else if(orig.length() < other.toString().length()) {return -1;}
     else{return 0;}
>>>>>>> 6fd1d72b67c3cf7d78746b0bf6d9863a9a302d6a
  }

  public String toString() { return orig; }
}
