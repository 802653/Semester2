//© A+ Computer Science
// www.apluscompsci.com

//sort example using an array of Comparable

import static java.lang.System.*;
import java.util.Arrays;

public class Sort
{
	public static void main ( String[] args )
	{
		Comparable[] creatureList = new Creature[3];
		//add 3 creatures to creatureList
		Creature c0 = new Creature(35);
		Creature c1 = new Creature(15);
		Creature c2 = new Creature(25);
		creatureList[0] = c0;
		creatureList[1] = c1;
		creatureList[2] = c2;
		
		Arrays.sort(creatureList);  		//will throw an exception until
															//creatures are added to the array		
		
		for(Comparable it : creatureList)
		{
			out.println(it);
		}		
  }
}