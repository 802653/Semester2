//© A+ Computer Science
// www.apluscompsci.com

//comparable example one

import static java.lang.System.*;
import java.util.Arrays;
public class WordRunner
{
	public static void main ( String[] args )
	{
		Word x = new Word("dog");
		Word y = new Word("cat");
		System.out.println( x.compareTo(y) );
		System.out.println( y.compareTo(x) );
		
		Word[] wordList = new Word[6];
		Word a = new Word("basketball");
		wordList[0] = a;
		Word b = new Word("wrench");
		wordList[1] = b;
		Word c = new Word("pool");
		wordList[2] = c;
		Word d = new Word("summer");
		wordList[3] = d;
		Word e = new Word("beach");
		wordList[4] = e;
		Word f = new Word("part");
		wordList[5] = f;
		Arrays.sort(wordList);
		for(int i = 0; i < wordList.length; i++) { out.println(wordList[i]);}
  }
}