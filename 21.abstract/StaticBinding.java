//� A+ Computer Science  -  www.apluscompsci.com

//static binding example 

public class StaticBinding 
{
  public static void main ( String[] args )
  {
		Object o = new String("dog");									//object has no length

		int lenny = ((String)o).length(); 
		System.out.println( lenny );
  }
}