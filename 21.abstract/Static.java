//© A+ Computer Science
// www.apluscompsci.com

//static example 

import static java.lang.System.*;
import java.util.*;
class Monster
{
   private String name;
   private static int count = 0;   //all Monsters share this var

   public Monster()
   {
       name = "";
       count++;
   }
   public Monster( String title )
   {
       name = title;
       count++;
   }

   public static int getCount( )
   {
       return count;
   }

   public String toString()
   {
       return name;
   }
}

class Witch extends Monster
{
   public Witch( String name )
   {
      super(name);
   }
}

class Ghost extends Monster
{
   public Ghost( )
   {
      //super constructor called automatically
   }

   public Ghost( String name )
   {
      super(name);
   }
}

class Static
{
  public static void main ( String[] args )
  {
      Monster[] monsters = new Monster[3];
      
      Monster child = new Monster("child"); 
      Monster lamp = new Monster("lamp");
      Witch table = new Witch("table");
      Ghost casper = new Ghost("casper");
      
      monsters[0] = child;
      monsters[1] = lamp;
      monsters[2] = table;
      monsters[3] = casper;
      
      for(int i = 0; i < monsters.length; i++) {
          System.out.print(monsters[i].getCount());
          System.out.print(" - " + monsters[i].toString() + ": ");
          System.out.println("");
      }
      
      
  }
}